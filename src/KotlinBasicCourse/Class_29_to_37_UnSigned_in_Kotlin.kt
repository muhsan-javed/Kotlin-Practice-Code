package KotlinBasicCourse

@OptIn(ExperimentalUnsignedTypes::class)
fun main() {

    // int, byte, short, long
    val i :UInt = 20U
    val b: UByte = 1u  // UByte, expected type provided
    val s: UShort = 1u // UShort, expected type provided
    val l: ULong = 1u  // ULong, expected type provided

    val a1 = 42u // UInt: no expected type provided, constant fits in UInt
    val a2 = 0xFFFF_FFFF_FFFFu // ULong: no expected type provided, constant doesn't fit in UInt

    val a = 1UL // ULong, even though no expected type provided and constant fits into UInt

    val uByteArray = ubyteArrayOf(12u,66u,99u,44u)
    println(uByteArray)
}