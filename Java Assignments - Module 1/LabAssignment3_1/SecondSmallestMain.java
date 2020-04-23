package LabAssignment3_1;

import java.util.Scanner;

public class SecondSmallestMain {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		SecondSmallest obj=new SecondSmallest();
		System.out.println("Enter size of array");
		int n=ob.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			array[i]=ob.nextInt();
		}
		System.out.println("Second Smallest number is : "+obj.findSecondSmallest(array));
		ob.close();
	}

}
