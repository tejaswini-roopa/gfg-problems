import java.util.Scanner;

public class findNthTerm {
    static int nthTerm(int n){
        int answer=0;
        for(int i=1;i<=n;i++)
            answer+=i;
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();
        findNthTerm obj=new findNthTerm();
        int ans=obj.nthTerm(number);
        System.out.println("the "+number+" th term of the series is "+ans);
    }
}
