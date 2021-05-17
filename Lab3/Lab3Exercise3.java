package corejava8lab3exercises;
import java.util.*;
public class Lab3Exercise3 {
	public String alterString(String str)
    {
           StringBuffer sb = new StringBuffer(str);
           for(int i=0;i<str.length();i++)
           {
                  char c = sb.charAt(i);
                  if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
                  {
                        sb.replace(i,i+1,String.valueOf((char)(c+1)));
                  }
           }
           return sb.toString();
    }
    public static void main(String[] ar)
    {
           Lab3Exercise3 obj = new Lab3Exercise3();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a string : ");
           String str = sc.next();
           System.out.println("Altered String : ");
           System.out.println(obj.alterString(str));
           
           sc.close();
    }
}
