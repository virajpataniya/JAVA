package patterns;

public class StarPattern {

   /*  public static void hollowRectangle(int row, int col) {
        // HollowRectangle
        //below forloop for rows--horizontal lines
        for (int i = 1; i <= row; i++) {
            //Below forloop for cols-vertical lines
            for (int j = 1; j <= col; j++) {
                if (i==1 || i == row || j==1 || j==col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }*/

    public static void invertHalfPyramid(int row){
        for (int i = 1; i <=row; i++) {
            //spaces
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        invertHalfPyramid(4);

       // hollowRectangle(4, 5);

        // Character array
        // char ch='.';
        /*
         * int ch = 65;
         * for (int i = 1; i <= 4; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(Character.toChars(ch));
         * ch++;
         * }
         * System.out.println();
         * }
         */

        // Half pyramid
        /*
         * for (int i = 1; i <=4; i++) {
         * for (int j = 1; j <=i; j++) {
         * 
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         */

        // number of lines
        /*
         * for (int i = 1; i <=4; i++) {
         * 
         * //number of times
         * for (int j = 1; j <=(4-i+1); j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

    }
}
