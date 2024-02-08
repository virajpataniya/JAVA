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
            for (int j = i+1; j < number.length-1; j++) {
                if (number[minPos]>number[j]) {
                    minPos=j;
                }
            }
            int temp=number[minPos];
            number[minPos]=number[i];
            
        }
    }

    public static void main(String[] args) {
        int number[]={5,3,2,8,6,9};
        bubbleSort(number);
        printArr(number);
    }
}
