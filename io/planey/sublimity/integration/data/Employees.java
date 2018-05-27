package io.planey.sublimity.integration.data;

import io.planey.sublimity.integration.datamodel.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * An {@link Data} that gets and posts {@link Employee}s to the employee data.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public class Employees implements Data<Employee> {

	/**
	 * Returns if the data has outstanding changes.
	 *
	 * @return has changes
	 */
	@Override
	public boolean hasChanges() {
		return false;
	}

	/**
	 * Gets the outstanding changes as a list of {@link Employee}.
	 *
	 * @return returns the {@link Employee} list
	 */
	@Override
	public List<Employee> getChanges() {
		return new ArrayList<>();
	}

	/**
	 * Pushes a list of {@link Employee} to the data.
	 *
	 * @param employees the {@link Employee} list
	 */
	@Override
	public void pushChanges(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(1);
		}
	}
}
