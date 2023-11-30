package Sorting;

import java.util.Arrays;

public class InsertionSort2
{
	public  static void insertionSort(int[] arr)
	{
		for(int i =1;i<arr.length;i++)
		{
			int key = arr[i];
			for(int j =i-1;j>=0  && arr[j]>key;j--)
			{
					int temp = arr[j];
					arr[j]=key;
					arr[j+1] =temp;
					//System.out.println(Arrays.toString(arr));
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {100,67,33,15,47,72,55,69,35,18};
		System.out.println("Given Array is:\n");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		//System.out.println(Arrays.toString(arr));

	}

}
