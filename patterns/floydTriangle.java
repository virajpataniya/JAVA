package patterns;
import java.util.*;
public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num to which pyramid expands: ");
        int num=sc.nextInt();
        floyd(num);
    }
    public static void floyd(int n) {

        int counter=1;
        for (int i = 1; i <=n; i++) {
        
            for (int j = 1; j <=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
