package lab4;

public class PowerOfTwo {
	public boolean checkNumber(int n)
	{
		if((n&(n-1))==0)
		{
			return true;
		}
		return false;
	}
}
