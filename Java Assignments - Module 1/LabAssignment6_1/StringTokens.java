package LabAssignment6_1;

import java.util.StringTokenizer;

public class StringTokens {
	public int calculateSum(String s)
	{
		int sum=0;
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			String token=st.nextToken();
			int number=Integer.parseInt(token);
			sum=sum+number;
			System.out.println(number);
		}
		return sum;
	}
}
