package io.planey.sublimity.integration.data;

import io.planey.sublimity.integration.data.connector.PeopleDataConnector;
import io.planey.sublimity.integration.datamodel.DataModelFactory;
import io.planey.sublimity.integration.datamodel.Person;

import java.util.List;

/**
 * An {@link Data} that gets and posts {@link Person}s to the people data.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class People implements Data<Person> {
	private final PeopleDataConnector peopleConnector;

	/**
	 * Instantiates a people data, and grabs a {@link PeopleDataConnector}.
	 */
	public People() {
		peopleConnector = new PeopleDataConnector();
	}

	/**
	 * Returns if the data has outstanding changes.
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
	 * Pushes a list of {@link Person} to the data.
	 *
	 * @param people the {@link Person} list
	 */
	@Override
	public void pushChanges(List<Person> people) {

	}
}
