package LabAssignment5_2;

public class FibonacciNonRecursive {
	public int sequence(int n)
	{
		int a=1,b=1,temp;
		while(n>2)
		{
			temp=b;
			b=a+b;
			a=temp;
			n--;
		}
		return b;
	}

}
