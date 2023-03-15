package KotlinBasicCourse

class Class_82_Confitional_Statements {
}

fun main() {

    // if else
    var a = 10
    var b = 5

    if (a>b){
        println(a)
    }else{
        println(b)
    }

    var max : Int

    max = if (a<b)
        a
    else
        b

    println(max)

    // Logical Operator
    // AND = &&
    // OR = ||
    // NOT = !

//    val a = 10
//    val b = 5
    val c = 8

    // &&
    if (a>b && a<c){
        println(a)
    }
    else if (b>a && b>c){
        println(b)
    }else {
        println(c)
    }

    // ||
    if (a<b || a>c)
        println("a is grater")
    else
        println("b or c is grater")

    // !
    if (a != c)
        println(true)
    else
        println(false)


    // Class 102 to 109

    // When Class 102
    var numbre = 100
    when(numbre){
        10->{ println(" > 100 ") }
        100->{ println(" => 100 ") }
        3->{ println(" < 100 ") }
        else->{ println("invalid") }
    }

    // when as Expression 103 rangeTo 104
//    val result = when(2){
//        in 1..5-> "i am in range of 2 to 5"
//        in 6.rangeTo(9)-> "i am Two"
//        else-> "Invalid"
//    }
//    println(result)

    // comma
//    val  res = when(4){
//        1,2,3,4-> " One to four"
//        else-> "Invalid"
//    }
//    println(res)

    // until keyword 106
//    val results = when(4){
//        in 1 until 4-> "one until 4"
//        else-> "Invalid"
//    }

    // multiple statement in When 107
    val result = when(4){
        in 1..4-> {
            "one until 4"
            "Hello how are you ?"
        }
        else-> "Invalid"
    }
    println(result)

    // !in operator with when 108
    val resultWhen = when(4){
        !in 1..4-> {
            "one until 4"
            "Hello how are you ?"
        }
        else-> "Invalid"
    }
    println(resultWhen)

}