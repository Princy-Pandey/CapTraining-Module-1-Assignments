package LabAssignment5_2;

public class FibonacciRecursive {
	public int sequence(int n)
	{
		int fibonacci=0;
		while(n>0)
		{
			if(n==1)
				return 1;
			if(n==2)
				return 1;
			else
			{
				fibonacci=sequence(n-1)+sequence(n-2);
				return fibonacci;
			}
		}
		return 0;
	}
}
