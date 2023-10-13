package DS.Strings;

public class Largeststring {
    public static void main(String[] args) {
        //str1.compareTo(str2) 
        // results are 0: equal 
        //              <0:-ve --->  str1<str2
        //             >0:+ve --->  str1>str2
        
       // For largest string
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
                     if(largest.compareTo(fruits[i])<0){
                     largest=fruits[i]; 
                }
        }
    }
}
