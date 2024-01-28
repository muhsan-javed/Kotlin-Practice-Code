package kotlin_learn_wscub


fun main() {
    // ********************  Inheritance *********************************

    /*
    > It is the mechanism by which one class is allow to inherit the features(fields and methods) of another class.

    > One object acquires all the properties and behaviors of a parent object.


    > It is an important part of OOPs (Object-Oriented programing system).

    > SubClass can reuse methods and  fields of the parent class.

    > By default, Kotlin classes are final - they can't be inherited. To make a class inheritable, mark it with the open keyword.

    */

    val classB = ClassB()

    //println("The Name is: "+ classB.name)
    //println("The sum is :" + classB.add(5,4))

    val classA = Inheritance_Kotlin()
    //println("The Name is: "+ classB.name +" , " + classA.name)
    println("The sum is :" + classB.add(5,4) + " , " + classA.add(5,4))

    // ********************  this vs super keyword *********************************


}


open class Inheritance_Kotlin { // Parent Class

    open var name = "Muhsan"

    open fun add(a: Int, b:Int) : Int{
        return a+b
    }

}

class ClassC : Inheritance_Kotlin(){

    override var name: String = "Harry"

    override fun add(a: Int, b: Int): Int {
       val sum = super.add(a, b)
        val sqr = sum*sum
        return sqr
    }
}