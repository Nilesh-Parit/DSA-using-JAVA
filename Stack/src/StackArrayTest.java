import java.util.Scanner;

public class StackArrayTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		do
		{
			System.out.println("---------------------------------");
			System.out.println("1. Push: Insert new element ⏬");
			System.out.println("2. POP: Delete top element ⏫");
			System.out.println("3. Peek: Get top element 🔃");
			System.out.println("4. Display the Stack 📶");
			System.out.println("0. For Exit 🔒");
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println("Enter Your Choice...😁");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:StackArrayBean.push();
					break;
				case 2:StackArrayBean.pop();
					break;
				case 3:StackArrayBean.peek();
					break;
				case 4:StackArrayBean.display();
					break;
				case 0: System.out.println("\nThank you...💕");
						System.exit(0);
					break;
			}
		}while(choice!=0);
		sc.close();
	}
}
