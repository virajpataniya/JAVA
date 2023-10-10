package DS.Array;

public class findInArray {


    public static int insideArray(int arr[],int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                return arr[i];
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,9};
        int target=8;
        System.out.println(insideArray(arr,target));
    }
}
