import java.io.*;
import java.util.*;

public class nprCalculation {
        static long nPr(long n, long r){

            // code here
            long ans= factorial(n)/factorial(n-r);

            return ans;
        }
        static long factorial(long t){
            if(t<1)
                return 1;
            return t*factorial(t-1);
        }
    public static void main(String args[])throws IOException
        {
            Scanner scanner=new Scanner(System.in);
            long n=scanner.nextLong();
            long r=scanner.nextLong();
                nprCalculation ob = new nprCalculation();
                System.out.println(ob.nPr(n, r));
            }
        }
