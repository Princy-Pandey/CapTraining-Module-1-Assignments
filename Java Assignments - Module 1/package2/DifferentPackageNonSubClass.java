package package2;

import package1.ClassDemo;

public class DifferentPackageNonSubClass {
	public void display()
	{
		ClassDemo obj=new ClassDemo();
		System.out.println("Different Package Non Sub Class");
		System.out.println("public data : "+obj.publ);
	}
    public static void main(String args[])
    {
    	DifferentPackageNonSubClass ob=new DifferentPackageNonSubClass();
    	ob.display();
    }

}
