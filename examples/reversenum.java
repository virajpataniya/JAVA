package examples;
import java.util.*;;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits which you want reverse in order");
        int num = sc.nextInt();
        int reverse=0;
        while (num>0) {
            int lastDigit=num%10;
            //below formula has *10 which helps to change digit position
            //eg from tens to 100s position  
            reverse=(reverse*10)+lastDigit;
            num=num/10;            
        }
        System.out.println("reverse number is :" +reverse);
    }
}
