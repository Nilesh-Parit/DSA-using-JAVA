package pac1;

import java.util.Scanner;

public class StackArrayBean
{
	private static int[] arr=new int[5];
	private static int top=-1;
	
	public static void push()
	{
		Scanner sc = new Scanner(System.in);
		if(top==4)
			System.out.println("\nOoops...Stack Overflow 🤭");
		else
		{
			System.out.println("Enter the element to push");
			arr[++top]=sc.nextInt();
			System.out.println("Element pushed successfully\n");
		}
	}
	public static void pop()
	{
		if(top==-1)
			System.out.println("Ooops...Stack Underflow 🤭");
		else
		{
			System.out.println("\nPopped Element is "+arr[top]);
			top--;
		}
	}
	public static void peek()
	{
		if(top==-1)
			System.out.println("Ooops...Stack is Empty 🤭");
		else
		{
			System.out.println("\nTop Element is "+arr[top]);
		}
	}
	public static void display()
	{
		if(top==-1)
			System.out.println("Ooops...Stack is Empty 🤭");
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
