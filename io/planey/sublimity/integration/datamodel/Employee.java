package io.planey.sublimity.integration.datamodel;

import io.planey.sublimity.integration.data.Data;

/**
 * An {@link DataModel} which defines the data requirements for {@link Data}s.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class Employee implements DataModel {
	/**
	 * Converts the employee object into json data, ready for adding to an data.
	 *
	 * @return returns the jsonified employee
	 */
	@Override
	public String toJson() {
		return null;
	}
}
