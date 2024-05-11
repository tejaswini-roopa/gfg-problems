import java.util.Scanner;
import java.util.Arrays;
class Solution
{
    public int findMedian(int[] v)
    {
        Arrays.sort(v);
        int n=v.length;
        int median=0;
        if(n%2==0){
            median=(v[n/2]+v[(n/2)-1])/2;
        }else{
            median=v[n/2];
        }
        return median;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int count = sc.nextInt();

        int[] arr = new int[count];
        System.out.println("Enter " + count + " numbers separated by space:");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int median = obj.findMedian(arr);
        System.out.println("Median: " + median);
    }
}
