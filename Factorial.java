import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Factorial 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int term,divisor,sum=0;
        while(tc-->0)
        {
            term = Integer.parseInt(br.readLine());
            divisor =5;
            sum = 0;
            while(divisor<term)
            {
                sum+=term/divisor;
                divisor*=5;
            }
            System.out.println(sum);
        }
        
    }
}
