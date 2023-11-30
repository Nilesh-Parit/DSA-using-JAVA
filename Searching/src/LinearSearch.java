import java.util.Scanner;

public class LinearSearch
{

	private static int linearSearch(int search,int[] arr)
	{
		int noOfSearches=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				noOfSearches++;
				System.out.println("Total no. of searches are "+noOfSearches);
				return i;
			}
			else
				noOfSearches++;
		}
		System.out.println("Total no. of searches are "+noOfSearches);
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {11,17,23,25,47,52,55,69,75,98};
		
		System.out.println("Given Array is:\n");
		for(int element:arr)
		{
			System.out.print(element+" ");
		}
		System.out.println("\n");
		
		System.out.println("Enter the element to search");
		Scanner sc = new Scanner(System.in);
		int search=sc.nextInt();
		
		int pos=linearSearch(search,arr);
		if(pos!=-1)
			System.out.println("Element found at array index "+pos);
		else
			System.out.println("Element not found");
		sc.close();
	}
}
