import java.util.Scanner;

public class theDiceProblem {
    static int oppositeFaceOFDice(int n){
        return 7-n;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number 1 to 6 for finding opposite face of that number in a dice");
        int number=scanner.nextInt();
        theDiceProblem ob=new theDiceProblem();
        int ans=ob.oppositeFaceOFDice(number);
        System.out.println("the opposite face is "+ans);
    }
}
