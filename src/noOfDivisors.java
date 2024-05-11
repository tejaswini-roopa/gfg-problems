import java.util.Scanner;

public class noOfDivisors {
    static long count_divisors(int N){
    long count = 0;
    int sqrt_N = (int)Math.sqrt(N);
        for (int i = 1; i <= sqrt_N; ++i)
    {
        if (N % i == 0)
        {
            if (i % 3 == 0)
            {
                count++;
            }
            if (i * i != N && (N / i) % 3 == 0)
            {
                count++;
            }
        }
    }
        return count;
}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number for finding the no of divisors");
        int number=scanner.nextInt();
        noOfDivisors obj=new noOfDivisors();
        long ans=obj.count_divisors(number);
        System.out.println(+number+" has "+ans+ " divisors that are divisible by 3");
    }
}

