package Sorting;

import java.util.Arrays;

public class QuickSort {
	
	

	private static void quickSort(int[] arr, int start, int end) {
		
		if(start<end) {
			int p = partition(arr,start,end);
			
			quickSort(arr,start,p-1);
			quickSort(arr,p+1,end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot =start;
		int i=start;
		int j =end;
		
		
		while(i<j) {
			
	      while(i<end && arr[i]<=arr[pivot]) {
	    	  i++;
	      }
	      while(j>pivot && arr[j]>arr[pivot]) {
	    	  j--;
	      }
	      
	      if(i<j) {
	    	  int temp = arr[i];
	    	  arr[i]=arr[j];
	    	  arr[j]=temp;
	      }
	      
	   }
		
		int temp = arr[j];
		arr[j] = arr[pivot];
		arr[pivot]=temp;
		
		return j;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {45,23,56,89,12,34,10};
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
