package KotlinBasicCourse

fun main() {
    // size 5 = 0,1,2,3,4
    var data = Array<Int>(5){
        it*2
    }

    println(data[4])

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

//    var dataInt = IntArray(5)
//    dataInt[0] = 12
//    dataInt[0] = 12
//    dataInt[0] = 12
//    println(dataInt[0])
    // size 5 = 0,1,2,3,4
    var dataInt = IntArray(5){
        it*2
    }
    println(dataInt[3])

    var dataByte = ByteArray(5)
    dataByte[0] = 124
    dataByte[1] = 123
    dataByte[2] = 122
    dataByte[3] = 121
    dataByte[4] = 120
    println(dataByte[3])

    var dataShort = ShortArray(5)
    dataShort[0] = 124
    dataShort[1] = 123
    dataShort[2] = 122
    println(dataShort[3])

    var dataLong = LongArray(5)
    dataLong[0] = 1241
    dataLong[1] = 12335
    println(dataLong[3])

    var dataFloat = FloatArray(5)
    dataFloat[0] = 12.41F
    dataFloat[1] = 1233.5f
    println(dataFloat[3])

    var dataDouble = DoubleArray(5)
    dataDouble[0] = 1241.5
    dataDouble[1] = 1233.5
    println(dataDouble[1])

    var dataChar = CharArray(5)
    dataChar[0] = 'M'
    dataChar[1] = 'U'
    println(dataChar[1])

    var dataBoolean = BooleanArray(3)
    dataBoolean[0] = true
    dataBoolean[1] = false
    println(dataBoolean[0])

    var dataUByte = UByteArray(5)
    dataUByte[0] = 123u
    dataUByte[1] = 50u
    println(dataUByte[0])

    var dataUShort = UShortArray(5)
    dataUShort[0] = 1243u
    dataUShort[1] = 5100u
    println(dataUShort[0])

    var dataUInt = UIntArray(5)
    dataUInt[0] = 1243u
    dataUInt[1] = 5100u
    println(dataUInt[0])

    var dataULong = ULongArray(5)
    dataULong[0] = 1243u
    dataULong[1] = 5100u
    println(dataULong[0])



}