package DS.Array;
import java.util.*;
public class Largest {

    public static int getLrgst(int arr[]) {
        int Largest=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (Largest<arr[i]) {
                Largest=arr[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int arr[]={2,6,4,10,8};
        System.out.println("largest value is " + getLrgst(arr));
    }
}
