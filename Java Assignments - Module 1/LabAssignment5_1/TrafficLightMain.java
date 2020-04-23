package LabAssignment5_1;

import java.util.Scanner;

public class TrafficLightMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TrafficLight obj=new TrafficLight();
		System.out.println("Enter 1 for red, 2 for yello or 3 for green \nPress 0 to exit");
		int n=sc.nextInt();
		while(n!=0)
		{
			obj.message(n);
			System.out.println("Enter 1 for red, 2 for yello or 3 for green \nPress 0 to exit");
			n=sc.nextInt();
		}
		sc.close();
	}
}
