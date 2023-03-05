package kotlin_learn_wscub


fun main() {

    highOrder(printMe)
    highAdd(sum)

}
val printMe = { println("This Line has been printed!") }

val sum = {a: Int, b: Int -> a+b}

val retSum = {a: Int, b:Int -> " The sum is: "+ {a+b}}

fun highOrder(func: ()-> Unit){
    func()
}

fun highAdd(addFunc: (Int, Int )-> Int) : (Int, Int) -> String {
    println("The sum is: " + addFunc(5,7))

    return retSum
}


class HighOrderFunctions(funx: ()->Unit) {


}