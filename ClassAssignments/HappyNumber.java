public class HappyNumber
{      
    public static int isHappy(int num){  
        int r = 0, sum = 0;  
         while(num > 0){  
            r = num%10;  
            sum = sum + (r*r);  
            num = num/10;  
        }  
        return sum;  
    }  
     
    public static void main(String[] args) {  
           
        System.out.println("First 10 happy numbers are: ");  
        for(int i = 1; i <= 45; i++){  
            int res = i;  
            while(res != 1 && res != 4){  
                res = isHappy(res);  
            }  
             
            if(res == 1)  
                System.out.print(i + "\n");  
        }  
    }  
}