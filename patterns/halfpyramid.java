package patterns;
import java.util.*;
public class halfpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of lines in which you want to print numbers");
        int n=sc.nextInt();
    for (int line = 1; line <= n; line++) {
        //Below describes * for one line
        for (int j = 1; j <= line; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
    }
}
