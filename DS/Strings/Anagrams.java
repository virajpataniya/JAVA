package DS.Strings;

import java.util.Arrays;

//Determine if 2 Strings are anagrams of each other. Anagram means if string contain same char buut different order

public class Anagrams {
    public static void main(String[] args) {
        String str1="taco";
        String str2="catu";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()==str2.length()) {
            char chArr1[]= str1.toCharArray();
            char chArr2[]= str2.toCharArray();
            Arrays.sort(chArr1);
            Arrays.sort(chArr2);
            Boolean result=Arrays.equals(chArr1, chArr2);
            if (result) {
                System.out.println("It is Anagram");
            } else {
                System.out.println("It's not anagram");
            }
        }else{
            System.out.println("Not anagram");
        }
    }
}
