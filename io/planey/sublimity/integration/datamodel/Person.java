package io.planey.sublimity.integration.datamodel;

import io.planey.sublimity.integration.data.Data;

/**
 * A {@link DataModel} which defines the data requirements for {@link Data}s.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class Person implements DataModel {
	/**
	 * Converts the person object into json data, ready for adding to an data.
	 *
	 * @return returns the jsonified person
	 */
	@Override
	public String toJson() {
		return null;
	}
}
