package io.planey.sublimity.integration.scheduling;

import io.planey.logger.Logger;
import io.planey.sublimity.integration.mapping.Integration;

import java.util.List;
import java.util.TimerTask;

/**
 * An {@link IntegrationRunner} that identifies when {@link Integration}s are ready to be run.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class IntegrationRunner extends TimerTask {
	private List<Integration> integrations;
	private final ScheduleChecker scheduleChecker;
	private final Logger logger;

	/**
	 * Gets the list of integrations to be run.
	 *
	 * @param integrations the list of integrations to be run
	 * @param scheduleChecker the checker for if an integration should be ran
	 * @param logger the logger for logging output
	 */
	public IntegrationRunner(List<Integration> integrations, ScheduleChecker scheduleChecker, Logger logger) {
		this.integrations = integrations;
		this.scheduleChecker = scheduleChecker;
		this.logger = logger;
	}

	/**
	 * Gets the list of integrations to be run.
	 *
	 * @return the current list of integrations to be run
	 */
	public List<Integration> getIntegrations() {
		return integrations;
	}

	/**
	 * Sets the list of integrations to be run.
	 *
	 * @param integrations the list of integrations to be run
	 */
	public void setIntegrations(List<Integration> integrations) {
		this.integrations = integrations;
	}

	/**
	 * Adds an integration to be run.
	 *
	 * @param integration the name identifier of the integration
	 */
	public void addIntegration(Integration integration) {
		this.integrations.add(integration);
	}

	/**
	 * Runs all the integrations if they are ready.
	 */
	public void run() {
		this.integrations.forEach(integration -> {
			if (scheduleChecker.isReady(integration.name())) {
				logger.info(integration.name().concat(" is running"));
				integration.run();
			}
		});
	}
}
