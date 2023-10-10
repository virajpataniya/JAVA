package examples;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to get  factorial");
        int n=sc.nextInt();
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        System.out.println("Here factorial value is "+ fact);
    }
}
