package io.planey.sublimity.integration.data.connector;

import io.planey.sublimity.integration.datamodel.Employee;

import java.util.List;

/**
 * A {@link DataConnector}s test stub
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class EmployeeDataConnector implements DataConnector<Employee> {
	@Override
	public boolean hasChanges() {
		return false;
	}

	@Override
	public String getChangedData() {
		return null;
	}

	@Override
	public void pushChangedData(List<Employee> employees) {

	}
}
