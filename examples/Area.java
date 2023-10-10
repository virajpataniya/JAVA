package examples;
import java.util.*;
public class Area {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the value of radius r, we will give you Area of circle.");
        float rad=sc.nextFloat();
        double Area=3.14*rad*rad;
        System.out.println("The value of Area is "+ Area);
    }
    
}
