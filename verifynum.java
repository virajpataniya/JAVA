import java.util.*;

 public class verifynum {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter any integer number");
            int usernum= sc.nextInt();
            if (usernum>0) {
                System.out.println("Your number is positive");
            } else {
                System.out.println("Your number is negative");
            }
    }
}
