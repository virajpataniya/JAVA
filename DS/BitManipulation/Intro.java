package DS.BitManipulation;

public class Intro {
    /*Here we are discussing fundamentals of it
        Bit-wise Operators with signs -->
        Binary AND &   1 0 1
                       1 1 0 
                       -----
                       1 0 0

        Binary OR |     1 0 1
                        1 1 0 
                        -----
                        1 1 1

        Binary XOR ^    1 0 1
                        1 1 0 
                        -----
                        0 1 1

        Binary One's complement ~   1 0 1
                                    1 1 0 
                                    -----
                                    1 1 1
                                    
        Binary left shift <<
        Binary right shift >>
    */

    public static void main(String[] args) {
        System.out.println("5 & 6 is "+(5&6));
        System.out.println("5 | 6 is "+(5|6));
        System.out.println("5 ^ 6 is "+(5^6));
        System.out.println("~5 is "+(~5));
    }
}
