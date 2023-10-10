import java.util.*;
public class primeinrange {
    

    public static boolean isPrime(int num){
        if (num==2) {
            return true;
        }

        for (int i = 2; i <= num-1; i++) {
            if (num%i==0) {               
                return false;                
            }
        }

        return true;
    }

    public static void checkPrimesInRange(int n) {
        for (int i = 2; i <=n; i++) {
            if (isPrime(i)) {
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter digit till you want to check the range of prime number ");
        // int n=sc.nextInt();
        // System.out.println(isPrime(16));
        checkPrimesInRange(20);

        
    }
}
