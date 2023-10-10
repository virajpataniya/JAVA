package DS.Array;
import java.util.*;
public class maxSubArray {

    public static void maxSubArr(int arr[]) {

        int maxSum= Integer.MIN_VALUE;
        int currSum=0;

        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                for (int k = start; k<=end; k++) {
                    //subArray sum
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if (maxSum<=currSum) {
                    maxSum=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sum is "+ maxSum);
    }

    public static void main(String[] args) {
        int arr[]={2,-1,3,-4,7};
        maxSubArr(arr);
    }
}
