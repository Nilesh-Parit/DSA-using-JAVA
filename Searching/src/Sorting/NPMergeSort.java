package Sorting;

import java.util.Arrays;

public class NPMergeSort
{
	private static void mergeSort(int start, int end, int[] arr)
	{
		if(start>=end)
			return;
		
		int mid = (start+end)/2;
		mergeSort(start,mid,arr);   //for Left-SubArray 
		mergeSort(mid+1,end,arr);	//for Right-SubArray
		merging(start,mid,end,arr); //for Merging 
	}
	
	private static void merging(int start,int mid,int end,int[] arr)
	{
		int index = 0;
		int idx1 = start;
		int idx2 = mid+1;
		
		int[] tempArr = new int[end-start+1];
		
		while(idx1<=mid && idx2<=end)
		{
			if(arr[idx1]<arr[idx2])
			{
				tempArr[index]=arr[idx1];
				index++;
				idx1++;
			}else
				{
					tempArr[index]=arr[idx2];
					index++;
					idx2++;
				}
		}
		while(idx1<=mid)
		{
			tempArr[index]=arr[idx1];
			index++;
			idx1++;
		}
		while(idx2<=end)
		{
			tempArr[index]=arr[idx2];
			index++;
			idx2++;
		}
		for(int i=0,j=start;i<tempArr.length;i++,j++)
		{
			arr[j]=tempArr[i];
		}
	}

	public static void main(String[] args)
	{
		int []arr = {11,64,32,14,52,59,45,75,42,36,57,47};
		
		System.out.println("The Given Array is");
		System.out.println(Arrays.toString(arr));
		
		mergeSort(0,arr.length-1,arr);
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
	}
}
