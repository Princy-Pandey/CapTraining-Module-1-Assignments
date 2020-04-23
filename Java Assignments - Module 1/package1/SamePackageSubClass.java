package package1;


public class SamePackageSubClass extends ClassDemo{
		public void display()
		{
			System.out.println("Same Package Sub Class");
			System.out.println("public data : "+publ);
			System.out.println("protected data : "+pro);
			System.out.println("default data : "+deflt);
		}
	    public static void main(String args[])
	    {
	    	SamePackageSubClass ob=new SamePackageSubClass();
	    	ob.display();
	    }

}
