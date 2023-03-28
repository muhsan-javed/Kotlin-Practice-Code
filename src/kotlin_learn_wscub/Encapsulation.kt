package kotlin_learn_wscub

class Encapsulation {

    // data members
    private var num1  = 32
    internal var num2 = 45
//    protected var num3 = 5
    // members functions
    fun add(){
        println("Sum of thres mnubers is= ${num1 + num2}")
    }
    fun multiply(){
        println("multiply of thres mnubers is= ${num1 + num2}")
    }
}

fun main() {
    val obj = Encapsulation()
    obj.add()
    obj.multiply()
    println(obj.num2)
}