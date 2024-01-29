package kotlin_learn_wscub


fun main() {

    // ********************  Interface kotlin *********************************
    /*
    => An interface is a reference type.
    => It is similar to class.
    => It is a collection of abstract methods.
    => A class implements an interface, thereby inheriting the abstract methods of the interface.
    => Only method signature, no-body
    => Interfaces specify what a class must do and not how. It is the blueprint of the class.
     */
    val classA = Interface_kotlin()
    val classB = ClassB()
    println("THe no isL "+ classA.firstNo + ", " + classB.firstNo)
    println("THe sum of two no is: "+ classA.add(4,6)+ ", " + classB.add(55,45))
    println("THe sum of three no is: "+ classA.add(4,6,8)+ ", " + classB.add(55,45, 100))


}

interface Add{
    var firstNo : Int
    fun add(a:Int, b:Int) :Int
    fun add(a:Int, b:Int, c:Int) :Int

}

class Interface_kotlin : Add {

    override var firstNo = 12

    override fun add(a: Int, b: Int): Int {
        return a+b
    }

    override fun add(a: Int, b: Int, c: Int): Int {

        return a+b+c
    }

}

class ClassB: Add{
    override var firstNo = 22

    override fun add(a: Int, b: Int): Int {
        return a+a+b+b
    }

    override fun add(a: Int, b: Int, c: Int): Int {
        return 3*(a+b+c)
    }

}