public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 3};
        System.out.println("Minimum merge operations required: " + findMinOps(arr));
    }
    public static int findMinOps(int [] arr){
        int n= arr.length;
        int [][] mn=new int[n][n];
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (arr[i] == arr[j]) {
                    mn[i][j] = mn[i + 1][j - 1];
                } else {
                    mn[i][j] = 1 + Math.min(mn[i + 1][j], mn[i][j - 1]);
                }
            }
        }
        return mn[0][n - 1];
    }
}