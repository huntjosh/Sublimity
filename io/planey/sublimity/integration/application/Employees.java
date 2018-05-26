package io.planey.sublimity.integration.application;

import io.planey.sublimity.integration.datamodel.Employee;

import java.util.List;

public class Employees implements Application<Employee> {

	@Override
	public boolean hasChanges() {
		return false;
	}

	@Override
	public List<Employee> getChanges() {
		return null;
	}

	@Override
	public void pushChanges(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(1);
		}
	}
}
