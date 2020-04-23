package LabAssignment5_4;

import java.util.Scanner;

import edu.lpu.training.util.EmployeeNameException;

public class EmployeeNameMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeName obj=new EmployeeName();
		System.out.println("Enter first name");
		String firstName=sc.nextLine();
		System.out.println("Enter last name");
		String lastName=sc.nextLine();
		try 
		{
			obj.checkEmployee(firstName, lastName);
		} 
		catch (EmployeeNameException e) 
		{
			System.out.println(e);
		}
		sc.close();
	}
}
