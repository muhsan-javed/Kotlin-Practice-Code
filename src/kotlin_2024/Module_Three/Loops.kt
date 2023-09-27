package kotlin_2024.Module_Three

fun main() {
    // Loops

    //While loop
    var i = 1
    //var sum = 0
    while (i <= 6){
        println("Line $i ")
        i++
        //sum += i // sum = sum + i
        //--i
    }
    //println("Sum = $sum")

    // do While loop
//    var sum = 0
//    var input:String
    var index = 7
    println()
   /* do {
        // perform a set of action while the value of index is  not equal to 0
        print("The val of index is $index")
//        print("Enter an integer")
//        input = readLine()!!
//        sum += input.toInt()
    } while (index != 0)*/
//    println("Sum $sum")

    do {
        // perform a set of action while the value of index is  not equal to 0
        println("The val of index is $index")
        --index
    } while (index != 0)

    println()

    // For Loop
    var name = "Scaler"
    for (eachText in name){
        println("Sum is: $eachText")
    }


}