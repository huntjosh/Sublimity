package io.planey.sublimity.integration.application;

import io.planey.sublimity.integration.application.connector.PeopleConnector;
import io.planey.sublimity.integration.datamodel.DataModelFactory;
import io.planey.sublimity.integration.datamodel.Person;

import java.util.List;

/**
 * An {@link Application} that gets and posts {@link Person}s to the people application.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class People implements Application<Person> {
	private final PeopleConnector peopleConnector;

	/**
	 * Instantiates a people application, and grabs a {@link PeopleConnector}.
	 */
	public People() {
		peopleConnector = new PeopleConnector();
	}

	/**
	 * Returns if the application has outstanding changes.
	 *
	 * @return has changes
	 */
	@Override
	public boolean hasChanges() {
		return true;
	}

	/**
	 * Gets the outstanding changes as a list of {@link Person}.
	 *
	 * @return returns the {@link Person} list
	 */
	@Override
	public List<Person> getChanges() {
		return DataModelFactory.parsePeopleJson(peopleConnector.getChangedData());
	}

	/**
	 * Pushes a list of {@link Person} to the application.
	 *
	 * @param people the {@link Person} list
	 */
	@Override
	public void pushChanges(List<Person> people) {

	}
}
