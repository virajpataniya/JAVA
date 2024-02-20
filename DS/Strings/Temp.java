package DS.Strings;

public class Temp {
    static {
    System.out.println("Static block");
}

{
System.out.println("Instance block");
}

public Temp() {
System.out.println("Super constructor");
}
public static void main(String[] args) {
    System.out.println("Main method");
    Temp t1=new Temp();
}

/*  Output is 

    Static block
    Main method
    Instance block
    Super constructor
*/
}
