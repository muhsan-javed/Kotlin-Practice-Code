package KotlinBasicCourse

fun main() {
    // size 5 = 0,1,2,3,4
    var data = Array<Int>(5){
        it*2
    }

    println(data[3])

    var data1 = IntArray(5){
        it*2
    }
//    data1[0] = 12
//    data1[1] = 14
//    data1[2] = 16
//    data1[3] = 18
//    data1[4] = 20
//
    println(data1[2])
}