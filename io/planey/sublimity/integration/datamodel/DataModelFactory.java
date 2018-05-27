package io.planey.sublimity.integration.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 * A factory for creating data models based on application json results.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class DataModelFactory {
	private DataModelFactory() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Parses person json, and creates a list of persons.
	 *
	 * @param json the json string which is used to create persons
	 * @return a list of persons
	 */
	public static List<Person> parsePeopleJson(String json) {
		List<Person> people = new ArrayList<>();
		people.add(new Person());

		return people;
	}
}
