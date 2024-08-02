public class SubArray {
    public int maxSubArray ( int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            // If currentSum is negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main (String[]args){
        SubArray solution = new SubArray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = solution.maxSubArray(nums);
        System.out.println("The maximum sum of a contiguous SubArray is: " + maxSum);
    }
}
