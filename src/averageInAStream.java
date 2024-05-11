import java.util.Scanner;

public class averageInAStream {
    float[] streamAvg(int[] arr, int n) {
        float[] avg = new float[n];
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            avg[i] = sum / (i + 1);
        }
        return avg;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        averageInAStream solution = new averageInAStream();
        float[] ans = solution.streamAvg(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", ans[i]);
        }
        scanner.close();
    }
}