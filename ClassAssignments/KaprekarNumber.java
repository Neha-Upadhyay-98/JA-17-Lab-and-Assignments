public class KaprekarNumber {
	
	static int kaprekar(int n)   
    {   
        if (n == 1)   
           return 1;   
        int sq = n * n;   
        int count= 0;   
        while (sq != 0)   
        {   
            count++;   
            sq /= 10;   
        }   
        sq = n*n;   
        for (int digits=1; digits<count; digits++)   
        {   
             int eq_parts = (int) Math.pow(10, digits);   
            if (eq_parts == n)   
                continue;   
             int sum = sq/eq_parts + sq % eq_parts;   
             if (sum == n)   
               return 1;   
        }   
        return 0;   
    }       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<1000; i++)   
            if (kaprekar(i)==1)   
                 System.out.print(i + "\n"); 
	}

}