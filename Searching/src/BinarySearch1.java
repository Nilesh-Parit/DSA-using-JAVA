//=====================================================================
//			         	By Normal Function
//=====================================================================
import java.util.Scanner;

public class BinarySearch1
{
	private static int binarySearch(int search,int[] arr)
	{
		int first=0;
		int last=arr.length-1;
		int noOfSearches=0;
		
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(arr[mid]==search)
			{
				noOfSearches++;
				System.out.println("Total no. of searches are "+noOfSearches);
				return mid;
			}
			else if(arr[mid]>search)
			{
				noOfSearches++;
				last=mid-1;
			}
			else
			{
				noOfSearches++;
				first=mid+1;
			}
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
		
		int pos=binarySearch(search,arr);
		if(pos!=-1)
			System.out.println("Element found at array index "+pos);
		else
			System.out.println("Element not found");
		sc.close();
	}
}
