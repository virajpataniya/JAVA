package patterns;
import java.util.*;
public class invertedstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of lines which you want to print * in reverse ");
        int n=sc.nextInt();
    for (int line = 1; line <= n; line++) {
        //Below describes * for one line
        for (int i = 1; i <= (n-i+1); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
