package DS.Strings;
import java.util.*;

public class PracticeStrings {
    public static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n=str.length();
            if (str.charAt(i)!=str.charAt(n-i-1)) {
                //Not a palindrome
                return false;
            }
        }
        return true;
    }
    public static float getPath(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);
            if (dir=='E') {
                x++;
            } else if (dir=='W') {
                x--;
            } else if (dir=='N') {
                y++;
            } else if (dir=='S') {
                y--;
            } else {
                System.out.println("You have put wrong direction");
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static String subString(String str,int si, int ei){
        String subStr="";
        for (int i = si; i < ei; i++) {
            subStr+=str.charAt(i);
        }
        return subStr;
    }

    public static String largestString(String str1, String str2){
        //My way
        int result=0;
        result= str1.compareTo(str2);
        System.out.println(result);
        if (result>0) {
            return str1;
        }
        else if (result<0) {
            return str2;
        }
        else if (result==0) {
            return "both are same";
        }
        return "Blank value";
    }
    public static void main(String[] args) {
        String str="racecar";
        String path= "WNEENESENNN";
        String str1="pineapple", str2="papaya";

        System.out.println("Largest string is "+largestString(str1, str2));
        //System.out.println(str.substring(2, 6));
        //System.out.println("Substring is "+subString(str, 2, 6));
        //System.out.println("length to reach point is "+getPath(path));
        //System.out.println(palindrome(str));
    }
}
