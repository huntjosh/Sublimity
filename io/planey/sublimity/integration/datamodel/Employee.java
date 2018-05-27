package io.planey.sublimity.integration.datamodel;

/**
 * An {@link DataModel} which defines the data requirements for {@link io.planey.sublimity.integration.application.Application}s.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class Employee implements DataModel {
	/**
	 * Converts the employee object into json data, ready for adding to an application.
	 *
	 * @return returns the jsonified employee
	 */
	@Override
	public String toJson() {
		return null;
	}
}
