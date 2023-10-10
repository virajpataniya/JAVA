package DS.Array;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12};
        int key=8;
        int index= linSrch(nums, key);
        if (index==-1) {
            System.out.println("Value not found");
        }
        else{
            System.out.println("key is at index : " + index);
        }
    }

    public static int linSrch(int nums[], int key){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==key) {
                return i;
            }
        }
        return -1;
    }
    
}