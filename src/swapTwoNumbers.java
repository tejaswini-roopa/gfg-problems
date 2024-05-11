import java.io.*;
import java.util.*;
import java.lang.*;
public class swapTwoNumbers {
        static List<Integer> get(int a,int b)
        {
            // code here
            int temp = a;
            a = b;
            b = temp;
            List<Integer> result = new ArrayList<>();
            result.add(a);
            result.add(b);
            return result;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                swapTwoNumbers ob = new swapTwoNumbers();
                List<Integer> ans = ob.get(a, b);
                System.out.println(ans.get(0) + " " + ans.get(1));

        }

}
