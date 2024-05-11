import java.util.Scanner;

public class sumOfPalindrome {
        long reverseDigits(long num) {
            long rev_num = 0;
            while (num > 0) {
                rev_num = rev_num * 10 + num % 10;
                num = num / 10;
            }
            return rev_num;
        }
     boolean isPalindrome(long num) {
            return (reverseDigits(num) == num);
        }
        long isSumPalindrome(long n) {
            int count = 0;
            while (!isPalindrome(n) && count < 5) {
                long k = reverseDigits(n);
                n += k;
                count++;
            }
            if (isPalindrome(n))
                return n;
            return -1;
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();
        sumOfPalindrome obj=new sumOfPalindrome();
       long ans=obj.isSumPalindrome(number);
        System.out.println(+ans+ " which is a palindrome");
    }
    }



