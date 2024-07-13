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

    private static void reverseArray(int[] num){
        int first=0,last=num.length-1;
        while (first<last) {
          // swap
          int temp=num[last];
          num[last]=num[first];
          num[first]=temp;
          first++;
          last--;
        }
    }
//arr= 1,2,3,1,4
    static void unrepetitiveNumbersIndex(int[] arr){
        boolean found = false;
        int i;
        for ( i = 0; i < arr.length; i++) {
            found = false;
            for (int j = 0; j < arr.length; j++) {
                //System.out.println("arr[" + i + "]"+ arr[i] + " arr[" + j + "]"+ arr[j]);
                if (i!=j && arr[i]==arr[j]) {
                    //System.out.println("found");
                    found=true;
                    break;
                }
            }
            if (!found) {
                System.out.print(" "+i);
            }
        }
    }

    public static void main(String[] args) {
        int key=5;
        int[] test = {1,5,3,9,7};
        int[] binArr= {1,3,5,7,9};
        int[] repeat= {1,2,3,1,4};
        unrepetitiveNumbersIndex(repeat);
        //reverseArray(binArr);
        // for (int i = 0; i < binArr.length; i++) {
        //     System.out.print(binArr[i]+ " ");   
        // }
        //System.out.println();
        //System.out.println("Index for key in Binary search is "+ binarySearch(binArr,key));
        //System.out.println("Largest in Array is "+largestInArray(test));
    }


}
