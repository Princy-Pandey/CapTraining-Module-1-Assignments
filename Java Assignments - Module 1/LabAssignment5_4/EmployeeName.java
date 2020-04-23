package LabAssignment5_4;

import edu.lpu.training.util.EmployeeNameException;

public class EmployeeName {
	public void checkEmployee(String firstName, String lastName) throws EmployeeNameException
	{
		if(firstName.isEmpty() && lastName.isEmpty())
		{
			throw new EmployeeNameException("Go home.. you are drunk!!");
		}
	}
}
