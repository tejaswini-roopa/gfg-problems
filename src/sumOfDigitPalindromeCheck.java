import java.util.Scanner;

public class sumOfDigitPalindromeCheck {
        int isDigitSumPalindrome(int n) {
            int sum = sumOfDigits(n);
            return isPalindrome(sum) ? 1 : 0;
        }

        int sumOfDigits(int n) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }

        boolean isPalindrome(int num) {
            int reversedNum = reverse(num);
            return num == reversedNum;
        }

        int reverse(int num) {
            int reversedNum = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                reversedNum = reversedNum * 10 + lastDigit;
                num /= 10;
            }
            return reversedNum;
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int number=scanner.nextInt();
        sumOfDigitPalindromeCheck eg=new sumOfDigitPalindromeCheck();
        boolean ans=eg.isPalindrome(number);
        System.out.println(ans);

    }
    }

