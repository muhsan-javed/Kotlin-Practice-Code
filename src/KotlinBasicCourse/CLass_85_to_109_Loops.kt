package KotlinBasicCourse

class CLass_85_Loops {
}

fun main() {
    // Loops
    for (i in 1..10){
        //println(i)
    }

    //rangeTo
    //for (i in 1.rangeTo(10))
        //println()

    // downTo
    //for (i in 10.downTo(1))
        //println()

    // step
    //for (i in 1..10 step 2)
        //println()

    // while loop
//    var i : Byte = 0
//    while (i<=10){
//        println(i)
//        i++
//    }

    // while loop
//    var s : Byte = 0
//    do {
//      s++
//      println(s)
//    } while (s<=10)

    // iterator()
//    val data = arrayOf(12,87,87,68,96,77,22,22)
//    val iterator = data.iterator()
//    while (iterator.hasNext()){
//        println(iterator.next())
//    }

    // forEach
    val data = arrayOf(12,87,87,68,96,77,22,22)
    data.forEach {
        //println(it)
    }

    // break keyword
//    for (i in 1..10){
//        if (i==5)
//            break
//        println(i)
//    }

    // continue keyword
//    for (i in 1..10){
//        if (i==5)
//            continue
//        println(i)
//    }


    // Nested loop
//    for (i in 1..3){
//        println("Outer loop $i")
//        for (j in 1..2){
//            println("inner loop $j")
//        }
//    }

    // break label
    outerloop@ for (i in 1..3){
        for (j in 1..5){
            if (j == 3)
                break@outerloop
            //println(j)
        }
    }

    // continue label
//    outerloop@ for (i in 1..3){
//        println("Outer loop $i")
//        for (j in 1..5){
//            if (j == 3)
//                continue@outerloop
//            println(j)
//        }
//    }


    // return keyword && return label
//    arrayOf(1,2,3,4,5,6,7,8,9).forEach loop@{
//        if (it == 3)
//            //return
////            return@forEach
//            return@loop
//        println(it)
//
//    }

    // forEach()
    arrayOf(1,2,3,4,5,6,7).forEach(fun(it:Int){
        //println(it)
    })


    // until keyword
    for (i in 1 until 5){
        println(i)
    }


}