package LabAssignment3_2;

import java.util.Scanner;

public class StringObjectMain {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		StringObjects obj=new StringObjects();
		System.out.println("Enter size of array");
		int n=ob.nextInt();
		String s[]=new String[n];
		String s1[]=new String[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			s[i]=ob.nextLine();
		}
		s1=obj.calculate(s);
		for(int i=0;i<n;i++)
		{
			System.out.println(s1[i]);
		}
		ob.close();
	}

}
