package examples;
import java.util.*;

public class weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any week day from 1 to 7");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("It is monday");
                break;

            case 2:
                System.out.println("It is tuesday");
                break;

            case 3:
                System.out.println("It is Wednesday");
                break;

            case 4:
                System.out.println("It is Thursday");
                break;

            case 5:
                System.out.println("It is Friday");
                break;

            case 6:
                System.out.println("It is Saturday");
                break;

            case 7:
                System.out.println("It is Sunday");
                break;

            default:
                System.out.println("Please select from 1-7 only ");
                break;
        }
    }
}
