import java.util.Scanner;
public class gcdOfTwoNumbers {
        public static int gcd(int a, int b) {
            // code here
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number:");
        int number1=scanner.nextInt();
        System.out.println("enter second number");
        int number2=scanner.nextInt();
        gcdOfTwoNumbers eg=new gcdOfTwoNumbers();
        int ans=eg.gcd(number1,number2);
        System.out.println("gcd of "+number1+" and "+number2+ " is " +ans);

}
    }



