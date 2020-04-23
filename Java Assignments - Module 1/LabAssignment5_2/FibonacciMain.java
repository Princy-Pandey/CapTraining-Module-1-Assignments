package LabAssignment5_2;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		System.out.println("Enter 1 for recursive, 2 for non recursive, 0 to exit");
		int ch=sc.nextInt();
		while(ch!=0)
		{
			switch(ch)
			{
			case 1:
				FibonacciRecursive obj=new FibonacciRecursive();
				System.out.println(obj.sequence(n));
				break;
			case 2:
				FibonacciNonRecursive obj1=new FibonacciNonRecursive();
				System.out.println(obj1.sequence(n));
				break;
			default:
				System.out.println("Go home, you are drunk");
			}
			System.out.println("Enter value of n");
			n=sc.nextInt();
			System.out.println("Enter 1 for recursive, 2 for non recursive, 0 to exit");
			ch=sc.nextInt();
		}
		sc.close();
	}

}
