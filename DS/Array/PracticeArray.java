package DS.Array;
import java.util.*;

public class PracticeArray {
    public static int update(int marks[], int temp){
        //Declare array in 2 types a) pass by value b) call by reference
        temp =10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        return temp;
    }

    public static int linearSearch(int numbers[],int key){

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]) {
        int largest= Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>largest) {
                largest=numbers[i];
            }
            if (numbers[i]<smallest) {
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value is "+smallest);
        return largest;
    }

    public static int binarySearch(int numbers[], int key){
        Arrays.sort(numbers);
        int start = 0, end = numbers.length-1;

        while (start<=end) {
            int mid = (start + end)/2;

            if (numbers[mid]==key) {
                return mid;
            } 
            if (key<numbers[mid]) {
               end=mid-1;
            } else {
                start=mid+1;
            }
            
        }

        return -1;
    }

    public static void reverseArray(int numbers[]){
        int first=0,  last=numbers.length-1;
        while (first<last) {
            //swap
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }

    }

    public static void pairsArr(int numbers[]){

        for (int i = 0; i < numbers.length; i++) {
            int curr=numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }
    }

    public static void subArr(int numbers[]){


        //My Way
        for (int i = 0; i < numbers.length; i++) {
            int curr=numbers[i];
            for (int j = i+1; j <= numbers.length; j++) {

                // Extract the sub-array from start to endIndex
                int[] subArray = Arrays.copyOfRange(numbers, i, j);

                // Print the sub-array using Arrays.toString()
                System.out.print(Arrays.toString(subArray));

                //System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }

        //Ma'am way
        for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for (int j = i; j < numbers.length; j++) {
                int end=j;
                for (int k = start; k <=end; k++) {//print
                    System.out.print(numbers[k]+" "); //subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int numbers[]= {2,5,7,9};
        int key=20;

        subArr(numbers);

        //pairsArr(numbers);
        /*reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " | ");
        } */


        //System.out.println("Largest number is "+getLargest(numbers));
        //update(marks,temp);
        
        /* for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
            System.out.println();
            System.out.println("Temp value is "+temp); */

           // int index= linearSearch(numbers, key);
           /* int index= binarySearch(numbers, key);
            if (index==-1) {
                System.out.println("Key not found");
            } else {
                System.out.println("Key is at index "+index);   
            } */

            //System.out.println("Index for key is "+binarySearch(numbers, key));
    }
}
