package package1;

public class SamePackageNonSubClass {
		public void display()
		{
			ClassDemo obj=new ClassDemo();
			System.out.println("Same Package Non Sub Class");
			System.out.println("default data : "+obj.deflt);
			System.out.println("public data : "+obj.publ);
			System.out.println("protected data : "+obj.pro);
		}
	    public static void main(String args[])
	    {
	    	SamePackageNonSubClass ob=new SamePackageNonSubClass();
	    	ob.display();
	    }

}
