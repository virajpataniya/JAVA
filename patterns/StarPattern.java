package patterns;

public class StarPattern {

    /*
        1
      2 1 2
    3 2 1 2 3 
                */

    public static void palinPattrn(int n) {
        for (int i = 1; i <=n; i++) {
            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //Des
                for (int j = i; j>=1; j--) {
                    System.out.print(j);
                }
            //Asc
                for (int j = 2; j <=i; j++) {
                    System.out.print(j);
                }
            System.out.println();
        }
    }

    public static void numPyramid(int n) {
        for (int i = 1; i <=n; i++) {
            //space
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //num
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

    public static void diamond(int n) {

        //1st half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for (int i = n; i >=1; i--) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                // star
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {// space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Help taken
    public static void oneZeroTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    // even
                    System.out.print("1");
                } else {
                    // odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // Done by myself
    public static void floydTriangle(int num) {
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    // Done by myself
    public static void invertHalfPyramidNumbers(int nums) {
        for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= nums - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void hollowRectangle(int row, int col) {
        // HollowRectangle
        // below forloop for rows--horizontal lines
        for (int i = 1; i <= row; i++) {
            // Below forloop for cols-vertical lines
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertHalfPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        palinPattrn(3);
        
        //numPyramid(5);

        //diamond(4);
        
        //hollowRhombus(5);

        // solidRhombus(5);

        // butterfly(5);

        // oneZeroTriangle(7);

        // floydTriangle(4);

        // invertHalfPyramidNumbers(7);

        // invertHalfPyramid(4);

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
