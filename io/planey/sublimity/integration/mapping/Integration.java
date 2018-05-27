package io.planey.sublimity.integration.mapping;

/**
 * Defines and runs mapping between applications.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public interface Integration {
	/**
	 * Maps the person to an employee.
	 *
	 * @return returns the integration name
	 */
	String name();

	/**
	 * Runs the integration mapping.
	 */
	void run();
}
