package patterns;
import java.util.*;
public class invertedHalfPyramid{
    public static void main(String[] args) {
        inHalfPy(5);
    }

    public static void inHalfPy(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}