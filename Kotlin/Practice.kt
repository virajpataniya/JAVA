fun main() {

    //Mutable variable 
    var changeAble: Int
    changeAble = 24

    //Immutable variable
    val notChangeable:Int = 25
    changeAble=26

    println("Changeable $changeAble")
    println("notChangeable $notChangeable")

    //Byte(8 bit): -128 to 127
    val myByte: Byte = 100
    
    //Short(16 bit): -32786 to 32767
    val myShort: Short = 12500

    //Int(32 bit): - 2 Billion to 2 Billion
    val myInt: Int = 1150000

    //Long(64 bit): -9223372036854775807L to 9223372036854775807L
    val myLong: Long = 12570500

    //Float(32 bit): store values for fractional parts
    val myFloat: Float = 3.14159f

    //Double(64 bit`): store values with greater precision
    val myDouble: Double = 22.5725585

    val myBoolean: Boolean = true 

    val myChar: Char = 'a'

    //For loop: defined starting and ending points
    for (i in 1..5) { //(i=1;i<=5;i++)
        //println(i)
    }

    for (i in 1 until 5) {
        //println(i)  // Will print 1, 2, 3, and 4, but not 5
    }

    //Array declaration --> int[] first= {1,2,3}
    val osNames= arrayOf("Windows", "iOS", "Android")

    //Edit
    osNames[1]="Linux"
    println(osNames[1])

    //Print full array
    //println(osNames.joinToString())  // This will output: Windows, iOS, Android

    //Iterating through an array
    for (name in osNames) {
        //println(name)
    }

    //For each loop
    osNames.forEach {name -> println(name)}

    sayHi("Viraj","24")

     val obj = Mustang()
     obj.speed()
 
}

    //"Not specified" is default arguement(fallback value) for making certain arguements optional  
    fun sayHi(name:String, age:String = "Not Specified"){
        println("Hi $name, you're age is $age")
    }

open class GeneralCar() {
    
    fun run(){
        println("Run bike")
    }
    fun childClass(){
        println(" Is child class")
    }

    //Init block: It is used when an instance of a class is created
    init {
        println("New car is created")
    }

    /* Visibility Modifiers
     * public (default): visible everywhere
     * private: not accessible from other classes 
     * protected: visible by subclasses
     * internal: visible within same module (package)
     */

     /* Collections
     * List -  Ordered collection in which we can access elements by using indices that define position for each element
     * Set - Collections of unordered unique elements, No duplicate elements
     * Map - Object that maps keys to values, keys are unique, Values can be duplicated
     */

     /* Function literals- When we assign function to variable it turns into function literal
     * Kotlin has 2 types- Lambda & Anonymous
     * Lambda Expression- 2 ways to execute:- E.g val add={a:Int,b:Int -> a+b}
     * a) Add parenthesis after variable name ()
     * b) call invoke method
     * Anonymous function- Function without name(Here we use return keyword while in lambda we don't)
     * val anonyFunc= fun(parameters):Returntype{ 
        function body
        return statement}
     */

}

class Mustang:GeneralCar() {
    
    fun speed(){
        println("Mustang speeds")
    } 
}

    