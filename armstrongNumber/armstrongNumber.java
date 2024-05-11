import java.util.Scanner;
class Solution {
    static String armstrongNumber(int n){
        // code here
        int m=n;
        int arm=0;
        while(0<n){
            int rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;
        }
        if(arm==m){
            return "Yes it is an armstrong number";
        }
        else{
            return "No it is not an armstrong number";

        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number for checking whether it is armstrong number or not");
        int number=scanner.nextInt();
        Solution solution=new Solution();
        String answer=solution.armstrongNumber(number);
        System.out.println(answer);
    }
}