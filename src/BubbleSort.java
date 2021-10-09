/*
 * Concept behind Bubble Sort
 * The concept behind bubble sort is that after each iteration of outer loop i the maximum element in the array will go at the last position.
 * As after each iteration the maximum element goes at the last position , we don't have to include it again in the sorting process.
 * That's why the size of the inner loop j decreases by i-1 after each iteration.
 *  Time Complexity for Bubble Sort : O(n^2)
 */

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args)
	{
		int[] arr = new int[] {3,2,1,5,4,7,6,22,11,66,33};
		bubblesort(arr);
	}
	
	public static void bubblesort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
