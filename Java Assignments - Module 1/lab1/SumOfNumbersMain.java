package lab1;
import java.util.Scanner;

public class SumOfNumbersMain {

	public static void main(String[] args) {
		SumOfNumbers obj=new SumOfNumbers();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		System.out.println("sum is : "+obj.calculateSum(n));
		sc.close();
	}
}
