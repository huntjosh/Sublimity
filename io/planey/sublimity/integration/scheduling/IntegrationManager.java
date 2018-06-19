package io.planey.sublimity.integration.scheduling;

import io.planey.logger.Logger;
import io.planey.sublimity.integration.mapping.Integration;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TimerTask;
import java.util.concurrent.*;

/**
 * An {@link IntegrationManager} that provides methods to manage async running of an {@link Integration}.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class IntegrationManager extends TimerTask {
	private final Integration integration;
	private final Logger logger;
	private final ScheduleChecker scheduleChecker;

	private int workerCount = 0;
	private List<Future> futures = new LinkedList<>();
	private ExecutorService executor;

	/**
	 * Creates an integration manager which can create a worker pool and assign integrations when ready to run.
	 *
	 * @param integration the list of integrations to be checked for running
	 * @param logger the logger for runtime logging
	 */
	public IntegrationManager(Integration integration, ScheduleChecker scheduleChecker , Logger logger) {
		logger.debug(integration.name() + " setting up");
		this.integration = integration;
		this.logger = logger;
		this.scheduleChecker = scheduleChecker;
	}

	/**
	 * Clears completed futures and queues up integration runs based on the free worker count.
	 */
	public void run() {
		if (!scheduleChecker.isReady(integration.name())) return;

		logger.debug(integration.name() + " running");
		clearCompleteFutures();
		logger.debug(integration.name() + " free worker count: " + freeWorkers());
		addIntegrationRuns(freeWorkers());
	}

	/**
	 * Clears futures which are complete.
	 */
	private void clearCompleteFutures() {
		ListIterator<Future> iterator = futures.listIterator();
		Future future;
		while (iterator.hasNext()) {
			future = iterator.next();
			logger.debug("Attempting to clear future ");
			if (future.isDone()) iterator.remove();
		}
	}

	/**
	 * Returns the current free worker count.
	 *
	 * @return the number of slacking off workers
	 */
	private int freeWorkers() {
		return workerCount - futures.size();
	}

	/**
	 * Creates a number of integration run runnables which are added to the executor queue.
	 *
	 * @param count the number of run runnables to queue
	 */
	private void addIntegrationRuns(int count) {
		logger.debug(integration.name() + " adding integration run count: " + count);
		for (int i = 0; i < count; i++) {
			logger.debug(integration.name() + " adding integration run");
			futures.add(executor.submit(integration::run));
		}
	}

	/**
	 * Creates a number of worker threads that individually run this integration.
	 *
	 * @param workerCount the number of instances of integration list workers in the pool
	 */
	public void spawnWorkerPool(int workerCount) {
		logger.debug(integration.name() + " spawning worker pool ");
		shutDownExecutor();
		this.workerCount = workerCount;
		executor = Executors.newFixedThreadPool(workerCount);
	}

	/**
	 * Attempts a graceful executor shutdown, if an executor has been created.
	 */
	private void shutDownExecutor() {
		if (executor != null) {
			executor.shutdown();
			try {
				if (!executor.awaitTermination(800, TimeUnit.MILLISECONDS)) {
					executor.shutdownNow();
				}
			} catch (InterruptedException e) {
				executor.shutdownNow();
				Thread.currentThread().interrupt();
			}
		}
	}
}
