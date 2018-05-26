package io.planey.sublimity.integration.application;

import io.planey.sublimity.integration.application.connector.PeopleConnector;
import io.planey.sublimity.integration.datamodel.DataModelFactory;
import io.planey.sublimity.integration.datamodel.Person;

import java.util.List;

public class People implements Application<Person> {
	private final PeopleConnector peopleConnector;

	public People() {
		peopleConnector = new PeopleConnector();
	}

	@Override
	public boolean hasChanges() {
		return true;
	}

	@Override
	public List<Person> getChanges() {
		return DataModelFactory.parsePeopleJson(peopleConnector.getChangedData());
	}

	@Override
	public void pushChanges(List<Person> people) {

	}
}
