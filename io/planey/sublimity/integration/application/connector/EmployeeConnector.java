package io.planey.sublimity.integration.application.connector;

import io.planey.sublimity.integration.datamodel.Employee;

import java.util.List;

public class EmployeeConnector implements Connector<Employee> {
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
