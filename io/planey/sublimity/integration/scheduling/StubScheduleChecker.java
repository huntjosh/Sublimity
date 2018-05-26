package io.planey.sublimity.integration.scheduling;

import io.planey.sublimity.integration.mapping.Integration;

/**
 * An {@link ScheduleChecker} that identifies when {@link Integration}s are ready to be run.
 * This is a stub class for mocking up an integration
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class StubScheduleChecker implements ScheduleChecker{
	@Override
	public boolean isReady(String integrationName) {
		return true;
	}
}
