import java.util.*;
public class DeleteIndexElement {
	
	static int[] deleteElement(int[] array, int size, int index) {
		if (array == null || index < 0 || index >= size)
			return array;
		int[] newArray = new int[size-1];
		for (int i= 0, k = 0; i < size; i++) {
			if (i == index) 
				continue;
			newArray[k++] = array[i];
		}
		return newArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		System.out.print("Enter the index of element to delete: ");
		int index = sc.nextInt();
		
		array = deleteElement(array, n, index);
		System.out.println("Resultant array: " + Arrays.toString(array));
		
		sc.close();
	}

}