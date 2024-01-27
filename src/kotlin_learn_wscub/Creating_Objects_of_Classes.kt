package kotlin_learn_wscub

import kotlin.jvm.internal.Intrinsics.Kotlin


fun main() {

    /*
    A class is a blueprint, and an object is an instance of a class.
    Usually, we define a class and then create multiple instances of that class by creating Objects.
    */

    val kb = Creating_Objects_of_Classes()
    println("the Integer is : ${kb.someInt}")
    println("Your age  is : ${Creating_Objects_of_Classes().age}")
    println("Sum  is : ${Creating_Objects_of_Classes().add(10,10)}")

    // ********************  Constructors *********************************
    println("Constructors")
    //val bs = KotlinBasic(64)
    //println("Sum  is : ${bs.someInt}")

    // ********************  Custom Constructors *********************************
    val bs = KotlinBasic(6,4)
    println("The Value Int"+ bs.someInt)
    println("The define value "+ KotlinBasic())

    // ********************  Companion Object *********************************



}

class KotlinBasic{
    var someInt = 10

//    init {
//        println("Constructors is call $someInt")
//    }

    constructor(a: Int, b:Int){
        val sum = a+b
        println("Addition of two is: " + sum)
    }

    constructor(a: Int = 100, b:Int = 300, c:Int = 100){
        val sum = a+b+c
        println("Addition of two is: " + sum)
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