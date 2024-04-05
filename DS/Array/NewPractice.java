package DS.Array;

import java.util.*;

public class NewPractice {
    private static int linearSearch(int[] test, int key) {
        for (int i = 0; i < test.length; i++) {
            if (test[i]==key) {
                return i;
            }
        }
        return 0;
    }

    private static int largestInArray(int[] num){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i]>largest) {
                largest=num[i];
            }

            if (num[i]<smallest) {
                smallest=num[i];
            }
        }
        return largest;
    }

    private static int binarySearch(int[] num, int key){
        int start=0, end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;

            if (num[mid]==key) {
                return mid;
            }
            if (num[mid]>key) {
                //Left
                end=mid-1;
            }
            else{
                //right
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int key=5;
        int[] test = {1,5,3,9,7};
        int[] binArr= {1,3,5,7,9};
        System.out.println("Index for key in Binary search is "+ binarySearch(binArr,key));
        //System.out.println("Largest in Array is "+largestInArray(test));
    }


}
