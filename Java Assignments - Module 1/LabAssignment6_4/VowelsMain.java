package LabAssignment6_4;

import java.util.Scanner;

public class VowelsMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vowels obj=new Vowels();
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		System.out.println("new word : "+obj.checkVowel(s));
		sc.close();
	}

}
