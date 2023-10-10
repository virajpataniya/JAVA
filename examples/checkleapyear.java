package examples;
import java.util.Scanner;

public class checkleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year number");
        int ynum = sc.nextInt();
        if (ynum % 4 == 0) {
            if (ynum % 100 == 0) {
                if (ynum % 400 == 0) {
                    System.out.println("Enter number is leap year");
                } else {
                    System.out.println("Your enter number is not leap year");
                }
            } else {
                System.out.println("Your enter number is leap year");
            }
        } else {
            System.out.println("Your enter number is not leap year");
        }
    }
}
