package lab2;

import java.util.Scanner;

public class DifferenceMain {

	public static void main(String[] args) {
			Difference obj=new Difference();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value of n");
			int n=sc.nextInt();
			System.out.println("Difference is : "+obj.calculateDifference(n));
			sc.close();
		}
	}


