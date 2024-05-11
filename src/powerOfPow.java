import java.util.Scanner;

public class powerOfPow {
    public long sum_of_square_evenNumbers(long n){
        return ((2*n)*(n+1)*(2*n+1))/3;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        long number=scanner.nextLong();
        powerOfPow obj=new powerOfPow();
        long ans= obj.sum_of_square_evenNumbers(number);
        System.out.println("sum of squares of first " +number+ " even natural numbers "+ans);
    }
}
