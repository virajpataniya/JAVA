package DS.Array;

public class DuplicateValue {

    public static boolean containsDuplicate(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,5,8,9,4,1};
        System.out.println(containsDuplicate(arr));
    }
}
