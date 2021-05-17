package corejava8lab3exercises;
import java.util.*;
public class Lab3Exercise1 {
	public static void main(String args[])
    {
                Scanner sc=new Scanner(System.in);
                System.out.println("\nEnter sequence of integers with space between them : ");
                String digit=sc.nextLine();
                StringTokenizer token=new StringTokenizer(digit);
                int num=0,sum=0;
                System.out.println("\nEntered digits are : ");
                while(token.hasMoreTokens())
                {
                            String s=token.nextToken();
                            num=Integer.parseInt(s);
                            System.out.print(num+" ");
                            sum=sum+num;
                }
                System.out.println();
                System.out.println("Sum is : "+sum);
    
                sc.close();
    }
}
