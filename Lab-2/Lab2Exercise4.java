package corejava8lab2exercises;
import java.util.*;
public class Lab2Exercise4 {
static int array_size = 0;
	
	public static int[] modifyArray(int[] arr)
	{
		int[] result_Array = new int[array_size];
		int k = 0;
		for(int i=0; i<array_size; i++)
		{
			boolean flag = true;
			for(int j = 0; j<result_Array.length; j++)
			{
				if(arr[i] != result_Array[j])
					continue;
				else
				{
					flag = false;
					break;
				}
			}
			if(flag)
				result_Array[k++] = arr[i];
		}
		Arrays.sort(result_Array);
		for(int i=0; i<result_Array.length / 2; i++)
		{
			int temp = result_Array[i];
			result_Array[i] = result_Array[result_Array.length-i-1];
			result_Array[result_Array.length-i-1] = temp;
		}
		return result_Array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		array_size = sc.nextInt();
		int[] array = new int[array_size];
		System.out.println("Enter the elements : ");
		for(int i=0; i<array_size; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("The modified array is : ");
		int[] sortedArray = modifyArray(array);
		
		for(int item : sortedArray)
		{
			if(item != 0)
				System.out.println(item);
		}
		
		sc.close();
	}
}
