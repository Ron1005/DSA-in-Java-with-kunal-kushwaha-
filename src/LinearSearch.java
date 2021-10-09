/*Concept behind Linear Search
 * In Linear Search we iterate through the entire array and check for each element we check whether the element at that position is equal to
 * our target .
 * If the element at position matches our target then we return the position else at the end if the element is not present in array 
 * then we return -1
 * Time Complexity for Linear Search is O(n)
 * */

public class LinearSearch {
	public static void main(String[] args)
	{
		int[] arr = new int[] {3,2,1,5,4,7,6};
		int target = 1;
		int res = LinearSearch(arr,target);
		System.out.println(res);
	}
	
	public static int  LinearSearch(int[] arr, int target)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
}
