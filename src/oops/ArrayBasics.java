package oops;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,21,4,5,2};
		int len= arr.length;
		Arrays.sort(arr);
		System.out.println("Array in ascending order!");
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nArray in descending order!");
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}	}

}
