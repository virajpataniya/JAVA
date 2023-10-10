import java.util.*;

public class printoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {

            n = sc.nextInt();
            System.out.println("Enter any value");

            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }

            System.out.println("Enter 1 if you want to  continue otherwise 0");
            choice = sc.nextInt();

        } while (choice == 1);
        System.out.println("Sum of even " + evenSum);
        System.out.println("Sum of odd " + oddSum);

    }
}