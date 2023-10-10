package DS.Array;
import java.util.*;
public class subarrays {

    private static void subArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) { //Loop is for select start point 
            int start=i; 
            for (int j = 1; j < arr.length; j++) { //Loop is for select end point 
                int end=j;
                for (int k = start; k <=end; k++) { // Loop is for print 
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,7,11,17};
        subArr(arr);
    }
}
