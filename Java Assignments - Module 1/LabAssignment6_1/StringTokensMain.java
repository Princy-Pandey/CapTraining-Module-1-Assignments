package LabAssignment6_1;

import java.util.Scanner;

public class StringTokensMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringTokens obj=new StringTokens();
		System.out.println("Enter a string of munbers");
		String s=sc.nextLine();
		System.out.println("Sum : "+obj.calculateSum(s));
		sc.close();
	}

}
