import java.util.Arrays;
import java.util.Scanner;
public class ChocolateDistribution {
    public static int findMinDiff(int[] chocolates, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        Arrays.sort(chocolates);
        if (n < m) {
            return -1;
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = chocolates[i + m - 1] - chocolates[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chocolates = {10, 1, 7, 8, 2, 23, 21, 41, 30, 47, 28, 42, 30, 49, 48, 26, 50};
        int m = 7;
        int n = chocolates.length;
        System.out.println("Minimum Difference is: " + findMinDiff(chocolates, m, n));
    }
}

