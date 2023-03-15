package KotlinBasicCourse

@OptIn(ExperimentalUnsignedTypes::class)
fun main() {

    // int, byte, short, long
    val i :UInt = 205420U
    val b: UByte = 127u  // UByte, expected type provided
    val s: UShort = 64354u // UShort, expected type provided
    val l: ULong = 190000020u  // ULong, expected type provided

    val uByteArray = ubyteArrayOf(12u,66u,99u,44u)
    val uShortArray = ushortArrayOf(12u,66u,99u,44u)
    val uIntArray = uintArrayOf(12u,66u,99u,44u)
    val uLongArray = ulongArrayOf(12u,66u,99u,44u)
    println(uByteArray)

    val a1 = 42u // UInt: no expected type provided, constant fits in UInt
    val a2 = 0xFFFF_FFFF_FFFFu // ULong: no expected type provided, constant doesn't fit in UInt

    val a = 1UL // ULong, even though no expected type provided and constant fits into UInt

}