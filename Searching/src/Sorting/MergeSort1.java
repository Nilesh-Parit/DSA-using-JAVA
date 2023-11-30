package Sorting;

import java.util.Arrays;

public class MergeSort1
{
	public static void mergeSort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int mid = (start+end)/2;
			
			mergeSort(arr,start,mid);//left
		    mergeSort(arr,mid+1,end);//right
		    merge(arr,start,end,mid);
		}	
    }
	
	private static void merge(int[] arr, int start, int end, int mid) {
		
		int i,j,k;
		int n1= mid-start+1;
		int n2 = end-mid;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		
		for(i=0;i<n1;i++) {
			left[i]=arr[start+i];
		}
		
		for(i=0;i<n2;i++) {
			right[i]=arr[mid+1+i];
		}
		i=0;
		j=0;
		k=start;
		
		while(i<n1&&j<n2) {
			
			if(left[i]<right[j]) {
				arr[k]=left[i];
				i++;
				k++;
			}
			else {
				arr[k]=right[j];
				j++;
				k++;
			}
			
		}
	     
		while(j<n2) {
			arr[k]=right[j];
			j++;
			k++;
			
		}
		
		while(i<n1) {
			arr[k]=left[i];
			i++;
			k++;
			
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {100,67,33,15,47,72,55,69,35,18};
		System.out.println("Given Array is:\n");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
