package examples;
import java.util.*;

public class multipleof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter number");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                System.out.println("Here we got multiple of 10 : "+num);
                break;
            }
        } while (true);
    }

}
