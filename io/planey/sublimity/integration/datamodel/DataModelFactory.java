package io.planey.sublimity.integration.datamodel;

import java.util.ArrayList;
import java.util.List;

public class DataModelFactory {
	private DataModelFactory() {
		throw new UnsupportedOperationException();
	}

	public static List<Person> parsePeopleJson(String json) {
		List<Person> people = new ArrayList<>();
		people.add(new Person());

		return people;
	}
}
