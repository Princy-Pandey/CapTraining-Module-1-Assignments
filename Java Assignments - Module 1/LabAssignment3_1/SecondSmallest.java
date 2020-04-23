package LabAssignment3_1;

public class SecondSmallest {

	public int findSecondSmallest(int array[])
	{
		int secondSmallestNumber=0,temp;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		secondSmallestNumber=array[1];
		return secondSmallestNumber;
	}

}
