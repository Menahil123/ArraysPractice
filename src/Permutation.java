import java.util.Arrays;
public class Permutation {
    public static void nextPermutation(int[] num) {
        int i = num.length - 2;
        // Find the first decreasing element from the end
        while (i >= 0 && num[i] >= num[i + 1]) {
            i--;
        }
        // If such an element is found, find the element just larger than it to swap
        if (i >= 0) {
            int j = num.length - 1;
            while (j >= 0 && num[j] <= num[i]) {
                j--;
            }
            swap(num, i, j);
        }
        // Reverse the elements after the index of the first decreasing element
        reverse(num, i + 1, num.length - 1);
    }
    // Utility method to swap two elements in the array
    private static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    // Utility method to reverse a part of the array
    private static void reverse(int[] num, int start, int end) {
        while (start < end) {
            swap(num, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        nextPermutation(num1);
        System.out.println("Next permutation: " + Arrays.toString(num1));
        int[] num2 = {3, 2, 1};
        nextPermutation(num2);
        System.out.println("Next permutation: " + Arrays.toString(num2));
        int[] num3 = {1, 1, 5};
        nextPermutation(num3);
        System.out.println("Next permutation: " + Arrays.toString(num3));
    }
}

/*The next permutation of an array of integers is the next lexicographically greater
 permutation of its integer. More formally, if all the permutations of the array are
 sorted in one container according to their lexicographical order, then the next
 permutation of that array is the permutation that follows it in the sorted container.
 If such arrangement is not possible, the array must be rearranged as the lowest
 possible order (i.e., sorted in ascending order).*/
