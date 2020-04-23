package LabAssignment3_3;

import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Reverse ob=new Reverse();
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		array=ob.reverseNumbers(array);
		for(int i:array)
		{
			System.out.print(i+" ");
		}
		sc.close();
	}

}
