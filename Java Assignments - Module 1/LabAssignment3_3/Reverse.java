package LabAssignment3_3;

import java.util.Arrays;

public class Reverse {

	public int[] reverseNumbers(int array[])
	{
		int rev=0,d,index=0;
		for(Integer n:array)
		{
			rev=0;
			while(n>0)
			{
				d=n%10;
				rev=rev*10+d;
				n=n/10;
			}
			array[index]=rev;
			index++;
		}
		Arrays.sort(array);
		return array;
	}
}
