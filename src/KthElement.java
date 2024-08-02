import java.util.Random;

public class KthElement {
    public static Random random = new Random();
    public static int FindKthLargestElement(int[] num, int k) {
        // Convert k to zero-based index for the quickSelect function
        return quickSelect(num, 0, num.length - 1, num.length - k);
    }
    public static int quickSelect(int[] num, int left, int right, int k) {
        if (left == right) {
            return num[left];
        }
        int pivotIndex = left + random.nextInt(right - left + 1);
        pivotIndex = partition(num, left, right, pivotIndex);
        if (k == pivotIndex) {
            return num[k];
        } else if (k < pivotIndex) {
            return quickSelect(num, left, pivotIndex - 1, k);
        } else {
            return quickSelect(num, pivotIndex + 1, right, k);
        }
    }
    private static int partition(int[] num, int left, int right, int pivotIndex) {
        int pivotValue = num[pivotIndex];
        // Move pivot to the end
        swap(num, pivotIndex, right);
        int storeIndex = left;

        for (int i = left; i <= right - 1; i++) {
            if (num[i] < pivotValue) {
                swap(num, storeIndex, i);
                storeIndex++;
            }
        }
        // Move pivot to its final place
        swap(num, storeIndex, right);
        return storeIndex;
    }
    private static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void main(String[] args) {
        int[] num1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("The " + k1 + "th largest element is: " + FindKthLargestElement(num1, k1));
        int[] num2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("The " + k2 + "th largest element is: " + FindKthLargestElement(num2, k2));
    }
}

/*We can also use the concept of heap in DSA to find the KthElement....
A Heap is a complete binary tree data structure that satisfies the heap property:
for every node, the value of its children is less than or equal to its own value.
Heaps are usually used to implement priority queues, where the smallest (or largest)
element is always at the root of the tree.*/
