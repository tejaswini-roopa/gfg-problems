import java.util.Scanner;
public class seriesAP{
        public static int nthTermOfAP(int a1, int a2, int n) {
            // code here
            int d=a2-a1;
            int ans=a1+(n-1)*d;
            return ans;

        }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter first number of ap series");
            int firstNumber=scanner.nextInt();
            System.out.println("enter second number of ap series");
            int secondNumber= scanner.nextInt();
            System.out.println("enter the which term of the ap series to be calculated");
            int n=scanner.nextInt();
            seriesAP eg=new seriesAP();
            int ans=eg.nthTermOfAP(firstNumber,secondNumber,n);
            System.out.println("the " +n+"th term of the ap series will be" );
            System.out.println(ans);
}
}
