package corejava8lab2exercises;
import java.util.Scanner;
public class Lab2Exercise1 {
	static int[] sortArray(int[] array,int size)
	{
		int temp=0,k=0;
		int[] newArray=new int[size];
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			newArray[k++]=array[i];
		}
		return newArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array:\n");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements of array:\n");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		sortArray(array,n);
		System.out.println("\nEnter which max number you want to find :\n");
		int index=sc.nextInt();
		if(index==1)
		{
			System.out.println(index+"st max element of the element is : "+array[index-1]);
		}
		else if(index==2)
		{
			System.out.println(index+"nd max element of the element is : "+array[index-1]);
		}
		else if(index==3)
		{
			System.out.println(index+"rd max element of the element is : "+array[index-1]);
		}
		else
		{
			System.out.println(index+"th max element of the element is : "+array[index-1]);
		}

		
		sc.close();
		
	}

}
