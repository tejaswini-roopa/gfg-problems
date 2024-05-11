import java.util.Scanner;

public class additionOfTwoNumbers {
    static int addition(int A,int B){
        int sum=A+B;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number ");
        int firstNumber=scanner.nextInt();
        System.out.println("enter second number ");
        int secondNumber= scanner.nextInt();
        additionOfTwoNumbers eg=new additionOfTwoNumbers();
        int ans=eg.addition(firstNumber,secondNumber);
        System.out.println("sum of "+firstNumber+ " and "+secondNumber+" is "+ans);
    }
}
