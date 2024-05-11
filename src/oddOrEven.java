import java.util.Scanner;

public  class oddOrEven {
    static String oddEven(int n){
        if(n%2==0)
            return "even";
        else
            return "odd";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int number=scanner.nextInt();
        oddOrEven eg=new oddOrEven();
        String ans=eg.oddEven(number);
        System.out.println(+number+" is "+ans+" number");
    }
}
