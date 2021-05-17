import java.util.*;
public class MergeUnsortedArrays {
	static int[] mergeArray(int[] array1, int[] array2) {
		int res[] = new int[array1.length + array2.length];
		int i = 0, k = 0, j = 0;
		while (i < array1.length) {
			res[k] = array1[i];
			i += 1;
			k += 1;
		}
		while (j < array2.length) {
			res[k] += array2[j];
			j += 1;
			k += 1;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the sizes of two arrays: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for (int i = 0; i < n1; i++)
			arr1[i] = sc.nextInt();
		for (int i = 0; i < n2; i++)
			arr2[i] = sc.nextInt();
		
		int[] mergedArray = mergeArray(arr1, arr2);
		System.out.println("Arrays after merging: " + Arrays.toString(mergedArray));
		
		sc.close();
	}

}