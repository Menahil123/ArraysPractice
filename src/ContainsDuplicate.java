import java.util.Arrays;
import java.util.Scanner;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] num) {
        Arrays.sort(num);
        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] num1 = {1, 2, 3, 4, 5, 6}; // No duplicate
        int[] num2 = {1, 2, 2, 4, 6, 6}; // Contains duplicate
        System.out.println(containsDuplicate(num1));
        System.out.println(containsDuplicate(num2));
    }
}