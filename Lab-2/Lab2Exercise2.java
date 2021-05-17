package corejava8lab2exercises;
import java.util.Scanner;
public class Lab2Exercise2 {

	public static void main(String[] args) 
    {
        int length;
        String temp;
        Scanner sc1 = new Scanner(System.in);
      
        System.out.print("Enter number of words :");
        length = sc1.nextInt();
        
        
        String words[] = new String[length];
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Enter the words :");
        for(int i = 0; i < length; i++)
        {
            words[i] = sc2.nextLine();
        }
        sc1.close();
        sc2.close();
        
        for (int i = 0; i < length; i++) 
        {
            for (int j = i + 1; j < length; j++) { 
                if (words[i].compareTo(words[j])>0) 
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        System.out.print("Sorted String :");
        for (int i = 0; i <= (length - 1)/2; i++) 
        {
            System.out.print(words[i].toUpperCase() + ", ");
        }
        for (int i =((length - 1)/2)+1 ; i <=length - 1 ; i++) 
        {
            System.out.print(words[i].toLowerCase() + ", ");
        }
    }

}
