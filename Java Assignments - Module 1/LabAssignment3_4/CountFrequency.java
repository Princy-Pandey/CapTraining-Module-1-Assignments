package LabAssignment3_4;

public class CountFrequency {
	public void count(char array[])
	{
		int freq[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			freq[i]=1;
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]!='0' && array[i]==array[j])
				{
					freq[i]++;
					array[j]='0';
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!='0')
			System.out.println(array[i]+" : "+freq[i]);
		}
	}

}
