package LabAssignment5_1;

public class TrafficLight {
	public void message(int n)
	{
		switch(n)
		{
		case 1:
			System.out.println("Red Light : STOP!!");
		    break;
		case 2:
			System.out.println("Yellow Light : GO AS FAST AS YOU CAN");
			break;
		case 3:
			System.out.println("Green Light : YOU CAN GO NOW");
			break;
		default:
			System.out.println("You are drunk.. choose correct option");
		}
	}
}
