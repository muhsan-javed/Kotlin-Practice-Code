package Kotlin1Hours
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    println("Hello, world!!!")
    var x:Int = 5
    val y:Int = 10

    x = 20
    // y = 30
    println(x)

    //var name:String = "Muhsan Javed"
    //name = 23
   // println("name is $name")

    // Nullable Types
    var myName:String?  = null

    if(myName != null){
        println(myName)
    }
    // if else Conditions

//    val age  = if(true){
//        print("inside true")
//        //10
//    }else{
//        //20
//    }

//     if (age == 25 ){
//         println("You can't vote")
//     }else{
//         println("play at home")
//     }

    var name = "Muhsan"
    when(name){
        "ali"-> println("awesome")
        "hello"-> println("wow")
        "Muhsan"-> println("Welcome to Class")
        else-> println("kuch bhi")
    }
    // Arrays
    val  names = arrayOf("Ali", "Muhsan", "Sahid", "Hyder", "Javed", "Uziar")
    val  newName = listOf<String>("Ali", "Muhsan", "Sahid", "Hyder", "Javed", "Uziar")
    val  oldName = mutableListOf("Ali", "Muhsan", "Sahid", "Hyder", "Javed", "Uziar",1)

    for (name in oldName){
        println(name)
    }
//    names.forEach {
//        println(it)
//    }
    // FUNCTIONS
    //println(operation(5,5))
    greethings(name="Muhsan", greet = "Good Evening")

    val output = operation(4,5) { a, b ->
        println("adding these two numbers")
        val temp = a*a
        temp + b
    }
    println(output)

    val p1 = Person("Muhsan")
    println(p1)

    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val newList = list.filter {
        it % 2 == 0
    }.map {
        it * it
    }.forEach {
        println("$it")
    }

    val myNAme :String? = "nullf"
//    if (myNAme){
//        println(myNAme)
//    }
    myNAme.let {
        print(myNAme)
    }
}
class Person(name: String){
    val name: String
        get() {
            TODO()
        }

    init {
        //name = name
    }
}
fun operation(a:Int, b:Int, operate: (Int,Int) -> Int) :Int {
    return operate(a, b)
}

fun operator(a:Int , b:Int ):Int = a + b
//fun operation(a:Int, b:Int ):Int {
//    return a+b
//}
fun greethings(greet:String = "Good Night", name: String ="Hello"){
    println("Hello $greet")
}
