import java.util.Scanner;
import java.util.*;
public class MinMaxFinder {
    public static int setMin(int[]A, int N){
        int Min=Integer.MAX_VALUE;
        for (int i=0; i<N; i++){
            if(A[i]<Min){
                Min=A[i];
            }
        }
        return Min;
    }
    public static int setMax(int[]A, int N){
        int Max=Integer.MIN_VALUE;
        for (int i=0; i<N; i++){
            if(A[i]>Max){
                Max=A[i];
            }
        }
        return Max;
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int[]A={2,3,4,5,6,7,8,9};
        int N= A.length;
        System.out.println("Minimum element is: "
                + setMin(A, N));
        System.out.println("Maximum element is: "
                + setMax(A, N));
    }
}
