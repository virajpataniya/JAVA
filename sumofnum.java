import java.util.*;
public class sumofnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n of which you want sum");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1; i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum is :"+ sum);
    }
}
