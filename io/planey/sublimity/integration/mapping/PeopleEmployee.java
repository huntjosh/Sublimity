package io.planey.sublimity.integration.mapping;

import io.planey.sublimity.integration.application.Employees;
import io.planey.sublimity.integration.application.People;
import io.planey.sublimity.integration.datamodel.Employee;
import io.planey.sublimity.integration.datamodel.Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleEmployee implements Integration {
	private final People peopleApplication = new People();
	private final Employees employeeApplication = new Employees();

	public void run() {
		List<Person> people = peopleApplication.getChanges();
		List<Employee> employees = new ArrayList<>();
		for (Person person : people) {
			employees.add(mapPersonToEmployee(person));
		}

		employeeApplication.pushChanges(employees);
	}

	public String name() {
		return "PeopleEmployee";
	}

	private Employee mapPersonToEmployee(Person person) {
		return new Employee();
	}
}
