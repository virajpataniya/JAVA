package DS.Sorting;

public class PracticeSort {
    public static void bubbleSort(int number[]) {
        boolean isSorted=false;
        for (int turn = 0; turn < number.length-1 && !isSorted; turn++) {
            isSorted=true;
            for (int j = 0; j < number.length-1-turn; j++) {
                if (number[j]>number[j+1]) {
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                    isSorted=false;
                }
            }
        }
        if (isSorted) {
            System.out.println("Array is already sorted");
        }

    }

    public static void printArr(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int number[]){
        for (int i = 0; i < number.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < number.length; j++) {
                if (number[minPos]>number[j]) {
                    minPos=j;
                }
            }
            int temp=number[minPos];
            number[minPos]=number[i];
            number[i]=temp;
        }
    }

    public static void insertionSort(int number[]){
        for (int i = 1; i < number.length; i++) {
            int curr=number[i];
            int prev=i-1;
            //Finding out correct pos to start
            while (prev>=0 && number[prev]>curr) {
                number[prev+1]=number[prev];
                prev--;
            }
            //Insertion
            number[prev+1]=curr;
        }
    }

    public static void main(String[] args) {
 
        int number[]={5,3,2,8,6,1};
        //insertionSort(number);
        //selectionSort(number);
        //bubbleSort(number);
        printArr(number);

        /*
        Arrays sort() Time complexity O(n logn)<O(n^2) which is less than Selection , Insertion & Bubble sort   
            sort(arr,startIndex,endIndex)    If we want to sort only some indices(blocks) -- For endIndex you have to put +1 digit 
            sort(arr, Collections.reverseOrder())    If we want to sort in Descending order
         */
    }
}
