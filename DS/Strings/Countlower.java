package DS.Strings;

//Count how many times lowercase vowels occurred in a String entered by the user

public class Countlower {
    public static void main(String[] args) {
        String str= "aaeiiouuuup";
        int count=0;
            for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);
                if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    count++;
                }        
            }
        System.out.println("Value is "+ count);
    }

    //EasY Method


    //My Approach
/*     public static int lowerCase(String str){
        int count;
        String vowels[]={"a","e","i","o","u"};
        for (int i = 0; i < str.length(); i++) {
            if (vowels[i].compareTo(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
*/
}
