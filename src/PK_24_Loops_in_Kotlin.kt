fun main(args: Array<String>) {
//    println()
//    println()
//    println()
//    println()
//    println()
//    println()//// Not Used
//    for (a in 1..10){
//        println(a)
//    }

//    for (a in 10 downTo 1) //println(a)

//    for (a in 1..20 step 3) //println(a)

    // class 25
    var name = "Muhsan"
    //for (a in name) //println(a)

    // Class 26
//    var i = 1
//    while (i < 10){
//        println(i)
//        i++
//    }

    // Class 27 Do While Loop
//    var i = 0
//    do{
//        println(i)
//        i++
//    }while(i<10);

    // Class 28 Break and Continue Statement
    var i = 0
    while (i<10){

        if (i == 5){
            i++
            continue
        }
        println(i)
        i++
        if (i == 8) {
            break
        }
    }
}