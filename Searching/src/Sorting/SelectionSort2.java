package Sorting;

import java.util.Arrays;

public class SelectionSort2 {
	
	public static void selectionSort(int[] arr)
	{
		int iteration=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean flag = false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp; 
					flag = true;
				}
			}
			iteration++;
			System.out.println("iteration "+iteration);
			System.out.println(Arrays.toString(arr));
			if(!flag)
				break;
			//System.out.println(Arrays.toString(arr));
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {100, 56, 65, 35, 12, 25, 6, 8, 7, 10};
		System.out.println("Given Array is:\n");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		//System.out.println(Arrays.toString(arr));
	}
}
