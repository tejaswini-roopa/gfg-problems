import java.util.Scanner;

class Solution {
    public static long seriesSum(int n) {
        long l = n;
        return l * (l + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int x = sc.nextInt();
        Solution obj = new Solution();
        long ans = obj.seriesSum(x);
        System.out.println("Sum of the series up to " + x + " is: " + ans);
    }
}
