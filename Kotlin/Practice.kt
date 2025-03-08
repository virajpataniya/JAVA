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
}