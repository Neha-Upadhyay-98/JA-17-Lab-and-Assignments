import java.util.Scanner;

class EvenOdd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length :\n");
		int n=sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		int even = 0, odd = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				even += array[i];
			else
				odd += array[i];
		}

		System.out.println("Even index positions sum: " + even);
		System.out.println("Odd index positions sum: " + odd);
		
		sc.close();
	}
}