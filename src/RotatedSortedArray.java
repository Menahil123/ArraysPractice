import java.util.Arrays;
import java.util.Scanner;
class RotatedSortedSearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                // Target is within the range of the left sorted part
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {
                // Target is within the range of the right sorted part
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        int result = search(nums, target);
        if (result != -1) {
            System.out.println("Index of " + target + ": " + result);
        } else {
            System.out.println(target + " is not present in the array.");
        }
        sc.close();
    }
}

