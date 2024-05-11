import java.util.Scanner;
public class reverseDigits {
        public static int reverse(int number) {
            int reversedNumber = 0;
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            return reversedNumber;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            reverseDigits obj = new reverseDigits();
            long reversedNumber = obj.reverse(number);

            System.out.println("Reversed number: " + reversedNumber);
        }
    }


