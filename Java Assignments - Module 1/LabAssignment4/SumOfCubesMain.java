package LabAssignment4;

import java.util.Scanner;

public class SumOfCubesMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		SumOfCubes ob=new SumOfCubes();
		System.out.println("sum of cubes of digits of the number : "+ob.calculate(n));
		sc.close();
	}

}
