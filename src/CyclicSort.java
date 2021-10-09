/*
 * Concept behind Cyclic Sort -- Refer Cyclic Sort 2
 * Cyclic sort must be applied , when it is given in the question that the array contains elements from 1 to n or 0 to n , or something similar
 * The idea behind cyclic sort is that every element must be present at position index-1 or index based on whether we start from 0 or 1
 * E.g. In an unsorted array of [5,2,4,3,1]
 * The correct index position for 1 will be value of 1-1 = 0
 *  The correct index position for 5 will be value of 5-1 = 4
 *  and so on...
 *  The outer loop i is iterated for n times where n is the length of the array
 *  Inside the loop we find what is the correct position for the current element 
 *  Then in if condition we check whether our current element is at correct position or not e.g. in above array the correct position for 5
 *  will be 5-1 which is 4
 *  If current element is not in correct position then we swap the current element with it's correct position . In above case 5 will be swapped 
 *  with element in position 4 which is 1.
 *  This if condition will be executed again and again till we get correct element for current position , which is 1 in the case where value of i 
 *  is 0 .
 *  If current element is at its correct position then we will increment i and move on to the next element.
 *  Time Complexity for Cyclic Sort : O(n)
 */

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args)
	{
		int[] arr = new int[] {3,2,1,5,4,7,6};
		int[] arr2 = new int[] {5,3,4,1,2};
		cyclicsort(arr);
		cyclicsort2(arr2);
	}
	public static void cyclicsort(int[] arr)
	{
		int pos;
		int temp;
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			while(arr[i]!=i+1)
			{
				pos=arr[i]-1;
				temp=arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void cyclicsort2(int[] arr)
	{
		int n = arr.length;
		int temp;
		int i=0;
		while(i<n)
		{
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct])
			{
				temp = arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}
			else
			{
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
