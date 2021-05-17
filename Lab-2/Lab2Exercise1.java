package corejava8lab2exercises;
import java.util.Scanner;
public class Lab2Exercise1 {
	 public int getSecondSmallest(int arr[],int n)
	 {
		 int i,j,temp;
		 n=arr.length;
		 for(i=0;i<n;i++) {
			 for(j=0;j<n;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 return arr[1];
	 }
	 
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int i;
			System.out.println("Enter the no. of elements");	
			int size=sc.nextInt();
			int array[]=new int[size];
			System.out.println("enter the elements of array:-");
			for(i=0;i<size;i++)
			{
				array[i] = sc.nextInt();
			}
			System.out.println("The given array is : ");
			for(i=0;i<size;i++)
			{
				System.out.print(array[i]+" ");
			}
			System.out.println("\n");
			Lab2Exercise1  num= new Lab2Exercise1();
			
			 num.getSecondSmallest(array,size);
			System.out.println("Second smallest element of the array =  "+array[1]);
			
			sc.close();
		}

}
