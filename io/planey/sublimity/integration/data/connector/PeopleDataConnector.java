package io.planey.sublimity.integration.data.connector;

import io.planey.sublimity.integration.datamodel.Person;

import java.util.List;

/**
 * A {@link DataConnector}s test stub
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class PeopleDataConnector implements DataConnector<Person> {
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
