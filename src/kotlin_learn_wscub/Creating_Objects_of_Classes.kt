package kotlin_learn_wscub

import kotlin.jvm.internal.Intrinsics.Kotlin


fun main() {

    // ********************  Object & Class *********************************
    /*
     A class is a blueprint, and an object is an instance of a class.
     Usually, we define a class and then create multiple instances of that class by creating Objects.
    */

    val kb = Creating_Objects_of_Classes()
    println("the Integer is : ${kb.someInt}")
    println("Your age  is : ${Creating_Objects_of_Classes().age}")
    println("Sum  is : ${Creating_Objects_of_Classes().add(10,10)}")

    // ********************  Constructors *********************************
    /*
    A constructor is a special member function that is invoked when an object of the class is created primarily to initialize variables or properties.
    A class needs to have a constructor and if we do not declare a constructor, then the compiler generates a default constructors

    Kotlin has two types of Constructors-
        Primary Constructor
        Secondary/ Custom Constructor
    */
    println("Constructors")
    //val bs = KotlinBasic(64)
    //println("Sum  is : ${bs.someInt}")

    // ********************  Custom Constructors *********************************
    /*
    A class in Kotlin can have at most one primary constructor, and one or more custom/secondary constructors.

    The primary constructor initializes the class, while the secondary constructor is used to initialize the class and introduce some extra logic.
     */
    val bs = KotlinBasic(6,4)
    println("The Value Int"+ bs.someInt)
    println("The define value "+ KotlinBasic())

    // ********************  Companion Object *********************************
    /*
    In Kotlin or any other programming language like Java and C#.

    whenever we want to call the method or whenever we want to access the members of a class then we make the object of the class and with the help of that object, we access the members of the class. */

}

//class KotlinBasic (val a:Int){
class KotlinBasic {
    var someInt = 10

    // ********************  Init Block *********************************
    /*
     The primary constructor cannot contain any code, the initialization code can be placed in a separate initializer block prefixed with the init keyword.
    */

//    init {
//        println("Constructors is call $someInt")
//    }

    constructor(a: Int, b:Int){
        val sum = a+b
        println("Addition of Two is: " + sum)
    }

    constructor(a: Int = 100, b:Int = 300, c:Int = 100){
        val sum = a+b+c
        println("Addition of Three is: $sum")
    }

    fun Add(a : Int , b:Int): Int{
        return a+b
    }
}

class Creating_Objects_of_Classes {

    var someInt = 10
    var age = 20


    fun add(a : Int , b:Int): Int{
        return a+b
    }
    val addName = "Hello !!!"
//    companion object{
//        @JvmStatic
//        fun main(args: Array<String>) {
//
//        }
//    }
}