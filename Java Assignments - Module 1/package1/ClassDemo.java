package package1;

public class ClassDemo {
	public int publ=10;
	int deflt=20;
	protected int pro=30;
	private int prvt=40;
	public void display()
	{
		System.out.println("default data : "+deflt);
		System.out.println("private data : "+prvt);
		System.out.println("public data : "+publ);
		System.out.println("protected data : "+pro);
	}
    public static void main(String args[])
    {
    	ClassDemo ob=new ClassDemo();
    	ob.display();
    }
}
