import java.util.Scanner;

public class DuplicateIntegers {  
	public static void main(String[] args) {      
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array length :");
        int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the array elements::");
        for(int i=0;i<n;i++)
        	array[i]=sc.nextInt();     
        System.out.println("Duplicate elements in given array: ");    
        for(int i = 0; i < array.length; i++) {  
            for(int j = i + 1; j < array.length; j++) {  
                if(array[i] == array[j])  
                    System.out.println(array[j]);  
            }
        }
        sc.close();
	}
}