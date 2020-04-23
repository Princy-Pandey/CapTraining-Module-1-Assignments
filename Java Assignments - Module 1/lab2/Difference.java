package lab2;

public class Difference {
	public int calculateDifference(int n)
	{
		int sumOfSquares=0, squareOfSum,sum=0;
		for(int i=1;i<=n;i++)
		{
			sumOfSquares=sumOfSquares+(i*i);
			sum=sum+i;
		}
		squareOfSum=sum*sum;
		return sumOfSquares-squareOfSum;
	}

}
