package LabAssignment6_3;

import java.util.Scanner;

public class MirrorImageMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MirrorImage obj=new MirrorImage();
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		System.out.println("mirror image : "+obj.createMirror(s));
		sc.close();
	}

}
