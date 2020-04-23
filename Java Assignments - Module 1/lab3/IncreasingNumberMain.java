package lab3;

import java.util.Scanner;

public class IncreasingNumberMain {

	public static void main(String[] args) {
		IncreasingNumber obj=new IncreasingNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		System.out.println("Difference is : "+obj.checkNumber(n));
		sc.close();
	}

}
