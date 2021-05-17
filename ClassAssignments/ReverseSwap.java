import java.util.Scanner;

public class ReverseSwap{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array length::");
        int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the array elements::");
        for(int i=0;i<n;i++)
        	array[i]=sc.nextInt();
        for(int i=0;i<n/2;i++){
            array[i] = array[i]+array[n-i-1];
            array[n-i-1] = array[i]-array[n-i-1];
            array[i] = array[i] - array[n-i-1];
        }
        System.out.println("Array in Reverse Form");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}