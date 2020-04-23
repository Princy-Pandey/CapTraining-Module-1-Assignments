package LabAssignment3_4;

import java.util.Scanner;

public class CountFrequencyMain {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		CountFrequency obj=new CountFrequency();
		System.out.println("Enter string");
		String s=ob.next();
		char array[]=s.toCharArray();
		obj.count(array);
		ob.close();
	}

}
