//=====================================================================
//			         	By Normal Function
//=====================================================================
package Sorting;
import java.util.Arrays;

public class BubbleSort1
{
	private static void bubbleSortDsc(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			//System.out.println(Arrays.toString(arr));
		}
	}
	
	private static void bubbleSortAsc(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			//System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {100,67,33,15,47,72,55,69,35,18};
		System.out.println("Given Array is:\n");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n");
		bubbleSortAsc(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n");
		bubbleSortDsc(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("passes: " + (arr.length - 1));
	}
}
