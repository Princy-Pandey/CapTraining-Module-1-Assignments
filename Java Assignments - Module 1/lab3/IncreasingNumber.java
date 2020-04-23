package lab3;

public class IncreasingNumber {
	public boolean checkNumber(int n)
	{
		int digit1,digit2;
		while(n>0)
		{
			digit1=n%10;
			n=n/10;
			digit2=n%10;
			if(digit1<digit2)
				return false;
		}
		return true;
	}

}
