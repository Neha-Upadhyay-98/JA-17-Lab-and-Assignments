package corejava8lab3exercises;
import java.util.*;
public class Lab3Exercise2 {
	public String getImage(String str)
    {
           StringBuffer sb = new StringBuffer(str);
           sb.append('|');
           StringBuffer s = new StringBuffer(str);
           s.reverse();
           sb.append(s);
           return sb.toString();
    }
    public static void main(String[] args)
    {
          Lab3Exercise2 obj =new Lab3Exercise2();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a String : ");
           String str = sc.next();
           System.out.println(obj.getImage(str));
           
           sc.close();
    }
}
