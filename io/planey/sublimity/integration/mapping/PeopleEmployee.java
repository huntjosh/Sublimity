package io.planey.sublimity.integration.mapping;

import io.planey.sublimity.integration.data.Data;
import io.planey.sublimity.integration.data.Employees;
import io.planey.sublimity.integration.data.People;
import io.planey.sublimity.integration.datamodel.Employee;
import io.planey.sublimity.integration.datamodel.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * An {@link Integration} that lays out the mapping between {@link Data}s.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class PeopleEmployee implements Integration {
	private final People peopleData = new People();
	private final Employees employeeData = new Employees();

	/**
	 * Runs the mapping between the people and employees datas.
	 */
	public void run() {
		List<Person> people = peopleData.getChanges();
		List<Employee> employees = new ArrayList<>();
		for (Person person : people) {
			employees.add(mapPersonToEmployee(person));
		}

		employeeData.pushChanges(employees);
	}

	/**
	 * Runs the mapping between the people and employees datas.
	 *
	 * @return the name of this integration
	 */
	public String name() {
		return "PeopleEmployee";
	}

	/**
	 * Maps the person to an employee.
	 *
	 * @param person the person to be mapped to an employee
	 * @return returns the newly created employee
	 */
	private Employee mapPersonToEmployee(Person person) {
		return new Employee();
	}
}
