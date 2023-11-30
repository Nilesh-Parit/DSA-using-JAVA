package Sorting;

import java.util.Arrays;

public class SelectionSort1
{
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				
			}
			
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {100,67,33,15,47,72,55,69,35,18};
		System.out.println("Given Array is:\n");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("passes: " + (arr.length - 1));
	}

}
