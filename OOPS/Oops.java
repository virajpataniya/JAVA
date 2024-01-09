package OOPS;

public class Oops {
    public static void main(String[] args) {

       /**  Mustang mr= new Mustang();
        mr.initialize();
        mr.run();

        Ferrari fr= new Ferrari();
        fr.initialize();
        fr.run();  
        */

        Mechanic mch = new Mechanic();
        mch.Manual();
        
    }

    protected static void test(String name){
        System.out.println("Call from different class");
    }
}


//Abstract class
abstract class Car {

    void initialize(){
        System.out.println("Parent class Car ");
    }

    abstract void run();

    
}

interface Testing{
    void Manual();
}

class Mechanic implements Testing{
    public void Manual(){
        System.out.println("Mechanic calls");
    }
} 

class Mustang extends Car{

    @Override
    void run() {
       System.out.println("Mustang call");
    }
    
}

class Ferrari extends Car{

    @Override
    void run() {
        System.out.println("Ferrari call");
    }
    
}
