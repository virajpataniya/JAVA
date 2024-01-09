package DS.Strings;

import OOPS.Oops;

public class Shortestpath extends Oops {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path is " +getShortestPath(path));
    }

    private static float getShortestPath(String path) {
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char val = path.charAt(i);
            if (val=='S') {
                y--;
            } else if(val=='N') {
                y++;
            } else if (val=='E') {
                x++;
            } else if(val=='W'){
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    //for string value comparison use .equals() & for substring we have .substring()   
    //for compare 2 strings we have .compareTo() & for ignore .compareToIgnoreCase()
    
    /*
     * str1.compareTo(str2) 
     * results are 0: equal 
     *             <0:-ve --->  str1<str2
     *             >0:+ve --->  str1>str2
     * 
     * For largest string
     * String fruits[] = {"apple", "mango", "banana"}
     * String largest = fruits[0];
     * for(i=1;i<str.fruits.length;i++)
     *      if(largest.compareTo(fruits[i])<0){
     *              largest=fruits[i]; 
     *         }
     * 
     */
}
