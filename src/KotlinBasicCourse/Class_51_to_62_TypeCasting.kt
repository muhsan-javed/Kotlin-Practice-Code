package KotlinBasicCourse

class Class_51_TypeCasting {
}

fun main() {

    // 1) small data type to large type
    // 2) large data type to small data type

    var data : String ="12"
//    var convert : Int = data.toInt()
//    var convert  = data.toShort()
//    var convert  = data.toLong()
//    var convert = data.toFloat()
//    var convert  = data.toDouble()
//    var convert  = data.toDouble()
//    var convert  = data.toBoolean()
    var convert  = data.toByte()
    // UnS
//    var convert  = data.toUInt()
//    var convert  = data.toUShort()
//    var convert  = data.toULong()
//    var convert  = data.toUByte()
    println(convert)

    var dataNew = 10
    var converter = data.toString()
    println(converter)

}