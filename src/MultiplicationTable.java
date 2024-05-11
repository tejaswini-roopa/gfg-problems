import java.io.*;
import java.util.*;


class MultiplicationTable{
    static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> table=new ArrayList<>();
        // code here
        for(int i=1;i<=10;i++){
            table.add(N*i);
        }
        return table;
    }



    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            MultiplicationTable ob = new MultiplicationTable();
            ArrayList<Integer> ans = ob.getTable(N);
            for (Integer val : ans)
                System.out.print(val + " ");
            System.out.println();
        }

}

