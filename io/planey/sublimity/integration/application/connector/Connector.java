package io.planey.sublimity.integration.application.connector;

import java.util.List;

/**
 * Connects to datasources and retrieves data for {@link io.planey.sublimity.integration.application.Application}s and
 * pushes data from {@link io.planey.sublimity.integration.application.Application}s.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public interface Connector<T> {
	/**
	 * Returns if the datasource has outstanding changes.
	 *
	 * @return has changes
	 */
	boolean hasChanges();

	/**
	 * Gets the outstanding changes as a json string.
	 *
	 * @return returns the json string
	 */
	String getChangedData();

	/**
	 * Pushes a list of {@link T} to the datasource.
	 *
	 * @param changes the {@link T} list
	 */
	void pushChangedData(List<T> changes);
}
