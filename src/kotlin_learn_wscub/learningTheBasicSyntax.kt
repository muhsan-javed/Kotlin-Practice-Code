package kotlin_learn_wscub

fun main() {

    val number :Int?
    number = 5

    //number = 10
    val myclass =learningTheBasicSyntax()
    println("Sum is ${myclass.Add(4,5)} ")

}


class learningTheBasicSyntax {

    fun Add(a:Int, b:Int):Int{
        return a+b
    }

}