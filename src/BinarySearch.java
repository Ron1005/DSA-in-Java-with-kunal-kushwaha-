/*
 * Concept behind Binary Search
 * In Binary Search we define the start and end element of our array , based on which we find the middle element by using the formula
 * mid = (start + end)/2
 * if value at arr[mid] is equal to our target then we return the mid position
 * else if value of our target is greater then value at mid then the new value of start will be mid + 1 i.e. now we will search in the second part 
 * of the array
 * else if value of our target is less then value at mid then the new value of end will be mid - 1 i.e. now we will search in the first part of the 
 * array
 * We must use binary search when it is given in the question that the given array is sorted , because binary search only works on sorted array.
 * Time Complexity for Binary Search : O(log(n))
 */
public class BinarySearch {
	public static void main(String[] args)
	{
		int[] arr = new int[] {1,2,3,4,5,6,7};
		int target = 2;
		int res =binarysearch(arr,target);
		System.out.println(res);
	}
	
	public static int binarysearch(int arr[],int target)
	{
		int start =0;
		int end = arr.length-1;
		int mid;
		while(start<=end)
		{
			mid = start + (end-start)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(target > arr[mid])
			{
				start = mid+1;
			}
			else
			{
				end =mid -1;
			}
		}
		return -1;
	}
}
