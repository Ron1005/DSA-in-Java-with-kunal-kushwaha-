/*
 * Concept behind Insertion Sort
 * The concept behind insertion sort is that after each iteration i of outer loop , the array will be sorted till position i.
 * The outer loop i runs for n-1 times where n is the length of the array
 * The inner loop j starts from position 1 greater then i and move backwards till it's value is greater then 0
 * at any stage if value at j is less then value at j-1 then we swap both the elements, Hence after each iteration the array is sorted 
 * in left till position i 
 * Time Complexity for Insertion Sort : O(n^2)
 */

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args)
	{
		int[] arr = new int[] {3,2,1,5,4,7,6,22,11,66,33};
		insertionsort(arr);
	}
	
	public static void insertionsort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
