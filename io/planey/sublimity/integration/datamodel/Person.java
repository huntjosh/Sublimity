package io.planey.sublimity.integration.datamodel;

/**
 * A {@link DataModel} which defines the data requirements for {@link io.planey.sublimity.integration.application.Application}s.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class Person implements DataModel {
	/**
	 * Converts the person object into json data, ready for adding to an application.
	 *
	 * @return returns the jsonified person
	 */
	@Override
	public String toJson() {
		return null;
	}
}
