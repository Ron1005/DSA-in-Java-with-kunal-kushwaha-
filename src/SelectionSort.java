/*
 * Concept behind Selection Sort
 * In selection sort we find the maximum or minimum element from the array and place it at the last or the first position respectively.
 * The selection sort in which we place the maximum element at the last position , works similar to the bubble sort
 * Similar to bubble sort we iterate the outer loop i for array n-1 times where n is the length of the array.
 * As after each iteration the maximum element is placed at the last position , we decrease the size of the array for which we have to 
 * find maximum element by n-i-1 where n is the length of the array
 * Time Complexity for Selection Sort : O(n^2) 
 */
import java.util.Arrays;

public class SelectionSort {
	public static void main(String args[])
	{
		int[] arr = new int[] {3,4,1,6,7,5,10,30,55,22,8,66,3};
		selectionsort(arr);
	}
	public static void selectionsort(int arr[])
	{
		int point;
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			point = findmax(arr,0,arr.length-i-1);
			System.out.println(point);
			temp=arr[point];
			arr[point]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static int findmax(int arr[],int start,int end)
	{
		int position=0;
		int maxelement=0;
		for(int i=0;i<=end;i++)
		{
			if(arr[i]>maxelement)
			{
				maxelement=arr[i];
				position=i;
			}
		}
		return position;
	}
}
