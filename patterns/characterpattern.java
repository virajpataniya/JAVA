package patterns;
import java.util.*;
public class characterpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of lines in which you want to print *");
        int n=sc.nextInt();
        char ch='A';
    for (int line = 1; line <= n; line++) {
        //Below describes * for one line
        for (int chars = 1; chars <= line; chars++) {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    }
}
