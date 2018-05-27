package io.planey.sublimity.integration.application;

import java.util.List;

/**
 * Parses data from {@link io.planey.sublimity.integration.application.connector.Connector}s, pushes data, and
 * identifies if there is outstanding changes.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public interface Application<T> {
	/**
	 * Returns if the application has outstanding changes.
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
	 * Pushes a list of {@link T} to the application.
	 *
	 * @param changes the {@link T} list
	 */
	void pushChanges(List<T> changes);
}
