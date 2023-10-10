package patterns;
import java.util.*;
public class butterfly {
    public static void main(String[] args) {
        butterflyMthd(7);
    }

   public static void butterflyMthd(int n){

        //1st half
        for (int i = 1; i <=n; i++) {
            //stars 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for (int i=n;i>=1;i--){
            //stars 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
   }
}
