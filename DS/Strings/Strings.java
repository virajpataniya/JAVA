package DS.Strings;

import java.util.Scanner;

public class Strings {
    public static void printValue(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[]= {'1','2','3'};
        String str= "abcd";
        String str2= new String("1234@#");
        //Above both string variable are same in program but slight differet in implementation  

        //Strings are Immutable

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();   //This next() will only store 1 word while nextLine() stores full line
        // System.out.println(name);

        // System.out.println(name.length());

        //String name= "VirajShore";
        printValue(name);
    }
}
