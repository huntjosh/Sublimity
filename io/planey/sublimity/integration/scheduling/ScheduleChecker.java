package io.planey.sublimity.integration.scheduling;

import io.planey.sublimity.integration.mapping.Integration;

/**
 * Identifies when {@link Integration}s are ready to be run.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public interface ScheduleChecker {
	/**
	 * Returns if the integration is ready to be run.
	 *
	 * @param integrationName the name identifier of the integration
	 * @return if the integration is ready to run
	 */
	boolean isReady(String integrationName);
}
