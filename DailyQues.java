import java.util.Arrays;

public class DailyQues {

    static int maxProduct(int[] subArr) {
        int maxProd = 0;
        for (int i = 0; i < subArr.length; i++) {
            for (int j = i; j < subArr.length; j++) {
                int current = subArr[i] * subArr[j];
                if (i != j || current > maxProd) {
                    maxProd = current;
                }
            }
        }
        return maxProd;
    }

    static int maxProductGpt(int[] subArr) {
        if (subArr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        // Initialize the two largest elements
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < subArr.length; i++) {
            if (subArr[i] > max1) {
                max2 = max1;
                // max2 is the second largest
                max1 = subArr[i];
            } else if (subArr[i] > max2) {
                max2 = subArr[i];
            }
        }
        // Return the product of the two largest numbers
        return max1 * max2;
    }


    static void findKthLargestElement(int[] arr,int k){
        Arrays.sort(arr);
        System.out.println("value is "+arr[arr.length-k]);
    }

    public static void main(String[] args) {
        int[] arrKth={4,2,1,3,5};
        findKthLargestElement(arrKth, 2);
    }
}
