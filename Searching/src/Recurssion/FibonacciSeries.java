package Recurssion;
import java.util.Scanner;

public class FibonacciSeries
{
	private static void fibonacci(int num1,int num2,int last)
	{
		int sum = num1 + num2;
		if(sum>=last)
			System.exit(0);
		System.out.print(sum+" ");
		fibonacci(num2,sum,last);
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the no.");
		Scanner sc = new Scanner(System.in);
		int last=sc.nextInt();
		fibonacci(0,1,last);
	}
}
