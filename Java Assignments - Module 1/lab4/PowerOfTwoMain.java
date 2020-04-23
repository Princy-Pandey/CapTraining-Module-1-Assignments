package lab4;

import java.util.Scanner;

public class PowerOfTwoMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PowerOfTwo obj=new PowerOfTwo();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println(n+" is power of 2 : "+obj.checkNumber(n));
		sc.close();
	}

}
