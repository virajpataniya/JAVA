import java.util.*;
public class printreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits which you want print in reverse");
        int num = sc.nextInt();
        while (num>0) {
            int lastDigit=num%10;
            System.out.print(lastDigit);
            num=num/10;            
        }
        
    }
}