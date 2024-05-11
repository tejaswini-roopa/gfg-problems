import java.util.Scanner;

public class greatestOfThreeNumbers {
    int greatestOfThree(int a,int b,int c){
        if(a>b && a>c) {
            return a;
        }
        else if (b>a && b>c) {
            return b;
        }
        else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int firstnumber=scanner.nextInt();
        System.out.println("enter second number");
        int secondnumber=scanner.nextInt();
        System.out.println("enter third number");
        int thirdnumber=scanner.nextInt();
        greatestOfThreeNumbers ob=new greatestOfThreeNumbers();
        int ans=ob.greatestOfThree(firstnumber,secondnumber,thirdnumber);
        System.out.println("the greatest number is "+ans);
    }
}
