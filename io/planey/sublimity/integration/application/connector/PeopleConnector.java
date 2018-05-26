package io.planey.sublimity.integration.application.connector;

import io.planey.sublimity.integration.datamodel.Person;

import java.util.List;

public class PeopleConnector implements Connector<Person> {
	@Override
	public boolean hasChanges() {
		return false;
	}

	@Override
	public String getChangedData() {
		return null;
	}

	@Override
	public void pushChangedData(List<Person> people) {

	}
}
