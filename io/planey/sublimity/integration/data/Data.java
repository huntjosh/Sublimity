package io.planey.sublimity.integration.data;

import io.planey.sublimity.integration.data.connector.DataConnector;

import java.util.List;

/**
 * Parses data from {@link DataConnector}s, pushes data, and
 * identifies if there is outstanding changes.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public interface Data<T> {
	/**
	 * Returns if the data has outstanding changes.
	 *
	 * @return has changes
	 */
	boolean hasChanges();

	/**
	 * Gets the outstanding changes as a list of {@link T}.
	 *
	 * @return returns the {@link T} list
	 */
	List<T> getChanges();

	/**
	 * Pushes a list of {@link T} to the data.
	 *
	 * @param changes the {@link T} list
	 */
	void pushChanges(List<T> changes);
}
