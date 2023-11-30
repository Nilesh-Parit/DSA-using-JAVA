package Sorting;

import java.util.Arrays;

public class InsertionSort1
{
	public  static void insertionSort(int[] arr)
	{
		
		for(int i =1;i<arr.length;i++) {
			
			int key = arr[i];
			int j =i-1; 
			
			for(;j>=0&&arr[j]>key;j--) { 
				arr[j+1]=arr[j]; 
				}
			arr[j+1]=key; 
			System.out.println(Arrays.toString(arr));
			
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {100,67,33,15,47,72,55,69,35,18};
		System.out.println("Given Array is:\n");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("passes: " + (arr.length - 1));
		//System.out.println(Arrays.toString(arr));

	}

}
