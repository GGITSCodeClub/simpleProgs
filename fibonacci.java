
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class fibonacci 
{
    static int memo[] = new int[1000],f;
    public static void main(String[] args) 
    {
        BigInteger b = new BigInteger(String.valueOf(2));
        int n;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        Arrays.fill(memo,-1);
        //System.out.println(fibo(n));
        double stime = System.currentTimeMillis();
        
        System.out.println(fibo2(n));
        System.out.println((System.currentTimeMillis()-stime)/1000);
    }
    static int fibo(int n)
    {
            if(n==1||n==2)
                return 1;
            return fibo(n-1)+fibo(n-2);
    }
    
    static int fibo2(int n)
    {
        if(memo[n]!=-1)
        {
            return memo[n];
        }
        
         if(n<=2)
            f= 1;
        else
        {
             f=fibo2(n-1)+fibo2(n-2);        
        }
            memo[n] = f;
           return f; 
        
    }
}
