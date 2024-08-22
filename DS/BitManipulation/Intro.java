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
                                    
        Binary left shift << 5<<2 000101 (It means shift all digit by 2 bits & put 00 at last)
                                   //// 
                                  010100 --> (10100)2 from binary to decimal --> 1x2^4+1x2^2=20
            we can also use a<<b=a*2^b
        Binary right shift >> 6>>1 000110 (It means shift all digit by 1 bit & put 00 at first)
                                    \\\\\
                                    000011 --> (00011)2 from binary to decimal --> 1x2^1+1x2^0=3 
            we can also use a>>b=a/2^b
    */

    public static void main(String[] args) {
        System.out.println("5 & 6 is "+(5&6));
        System.out.println("5 | 6 is "+(5|6));
        System.out.println("5 ^ 6 is "+(5^6));
        System.out.println("~5 is "+(~5));
        System.out.println("Left shift "+(5<<2)); 
        System.out.println("Right shift "+(6>>1));
    }
}
