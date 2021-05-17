package corejava8lab2exercises;

import java.util.*;

public class Lab2Exercise3 {
	public int [] getSorted(int[] arr)
	{
		int len = arr.length;
		for(int i=0;i<len;i++)
		{
			
			StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			s.reverse();
			arr[i]= Integer.parseInt(String.valueOf(s));
			
		}
		Arrays.sort(arr);
		
		return arr;
		
		
	}

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		
		size = sc.nextInt();
		int [] array = new int[size];
		System.out.println("Enter the element of the array :");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		Lab2Exercise3 ad = new Lab2Exercise3();
		int [] result_arr = new int[size];
		result_arr = ad.getSorted(array);
		for(int i=0;i<result_arr.length;i++)
		{
			System.out.println(result_arr[i] + " ");
		}
		sc.close();

	}
}
