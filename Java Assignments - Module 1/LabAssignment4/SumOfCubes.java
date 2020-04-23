package LabAssignment4;

public class SumOfCubes {
	public int calculate(int n)
	{
		int digit, sum=0;
		while(n>0)
		{
			digit=n%10;
			sum=sum+digit*digit*digit;
			n=n/10;
		}
		return sum;
	}

}
