package kotlin_learn_wscub

fun main() {
    println("Abstraction")
}

interface iClass {
    /********************  Abstraction Kotlin *********************************
     * 
    => Abstraction is one of the core concepts of Objected Oriented Programming.
    => When there is a scenario that you are aware of what functionalities a class should have,
    => but not aware of how the functionality is implemented or
    => if the functionality could be implemented in several ways, it is advised to use abstraction.
    => It contains abstract or non-abstract : variables and functions.
    => Abstract Class cannot be initiated but could be extensions is a Super Class.
    */

    var operator: String

    fun square(a: Int): Int {
        return a * a
    }
}

abstract class Abstraction_kotlin {

    var name: String = "Muhsan Javed"
    abstract var branch: String

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    abstract fun operate(a: Int, b: Int): Int
}

class MyClass : Abstraction_kotlin() {
    override var branch: String = "Comptuer"

    //val abClass = Abstraction_kotlin()

    override fun operate(a: Int, b: Int): Int {
        TODO("Not yet implemented")
    }

}

class newClass : iClass {
    override var operator: String
        get() = "Javed"
        set(value) {}

    override fun square(a: Int): Int {
        return a * a * a
    }
}