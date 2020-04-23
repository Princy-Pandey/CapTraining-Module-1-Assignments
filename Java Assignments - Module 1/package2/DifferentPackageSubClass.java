package package2;

import package1.ClassDemo;

public class DifferentPackageSubClass extends ClassDemo {
	public void display()
	{
		System.out.println("Different Package Sub Class");
		System.out.println("public data : "+publ);
		System.out.println("protected data : "+pro);
	}
    public static void main(String args[])
    {
    	DifferentPackageSubClass ob=new DifferentPackageSubClass();
    	ob.display();
    }
}
