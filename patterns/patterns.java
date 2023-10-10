package patterns;
import java.util.*;
public class patterns {
    public static void main(String[] args) {
        // zero_one_triangle(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
          diamond(5);
    }

    public static void zero_one_triangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for (int i = 1; i <= n; i++) {

            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

    public static void hollow_rhombus(int n){
        for (int i = 1; i <= n; i++) {

            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=n; j++) {
                if (i==1||i==n||j==1||j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");                  
                }
            }
            System.out.println();
            
        }
    }

    public static void diamond(int n){

        //1st half
        for (int i = 1; i <=n; i++) {
            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         //2nd half
         for (int i = n; i >=1; i--) {
            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
