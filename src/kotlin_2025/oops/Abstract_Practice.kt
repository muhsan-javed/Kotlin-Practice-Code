package kotlin_2025.oops

abstract class Animal {
    abstract val color :String

    // Concrete method
    fun eat(){
        println("Animal is eating")
    }

    // abstract method
    abstract fun speak()
}
class Cats: Animal() {
    override val color:String="black"
    /* override var color: String
        get() = "Black"
        set(value) {}
*/

    override fun speak() {
        println("Cat is speaking")
    }
}

fun main() {
    val animal = Cats()
    animal.eat()
    animal.speak()
}
//abstract class Abstract_Practice {
//}