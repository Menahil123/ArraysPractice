import java.util.*;
public class Query{
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        int[][] queries = {{0, 4}, {1, 3}, {2, 4}};
        int[] prefixSum = buildPrefixSumArray(arr);
        for (int[] query : queries) {
            int L = query[0];
            int R = query[1];
            int sum = getRangeSum(prefixSum, L, R);
            System.out.println("Sum of arr[] elements in range [" + L + ", " + R + "] is "
                    + sum);
        }
    }
    private static int[] buildPrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
    private static int getRangeSum(int[] prefixSum, int L, int R) {
        if (L == 0) {
            return prefixSum[R];
        } else {
            return prefixSum[R] - prefixSum[L - 1];
        }
    }
}