package DS.Array;
import java.util.*;
public class BinarySearch {

public static int BinSrch(int arr[], int key) {
    int start=0, end=arr.length-1;
    while (start<=end) {
        int mid=(start+end)/2;
        if (arr[mid]==key) {
          return mid;   
        }
        if (arr[mid]<key) { //right
            start=mid+1;
        } else { //left
            end=mid-1;
        }

    }
    return -1;
} 
    public static void main(String[] args) {
        int arr[]={2,5,7,9,11};
        int key=7;
        System.out.println("Key at Index is :" + BinSrch(arr,key));
    }
}
