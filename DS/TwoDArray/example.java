package DS.TwoDArray;

import java.util.Scanner;

public class example {

   static int key;

    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                    System.out.println("Found key at (" + i + ") (" + j + ")" );
                    return true;
                }
            }
        }

        System.out.println("Key not found");
        return false;
    }  


    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        
        System.out.print("Please enter total 9 digits: ");
        Scanner sc=new Scanner(System.in);
    

        //Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
            
        }

         //Output
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            
        }

        System.out.println("From your entered input please give any value to find in array: ");
        Scanner sc1=new Scanner(System.in);
        key=sc1.nextInt();

        search(matrix, key);
    }
}
