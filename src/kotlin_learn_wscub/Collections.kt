package kotlin_learn_wscub


fun main() {
        // ****************** LIST ************************
//    val list  = listOf("Muhsan", "uzair", "Brohi", 2, true , listOf(1,2,3) )
//
//    println(list)
//
//    val mList = mutableListOf<Any>("Muhsan", 40)
//    mList.add(0,"Muhsan")
//    mList.add("Sahib Khan")
//    mList.add(10)
//
//    val mAlist = mutableListOf("Pawna", false)
//    mList.addAll(mAlist)
//
//    println()
//    println(mList)

    // ****************** SET ************************

//    val set = setOf("12", 545, "Muhs")
//
//    print(set)
//
//    val mset = mutableListOf<Any>("Ali", 5550 ,"has", 1 , false)
//    mset.add(true)
//    mset.add("Hi")
//    print(mset)

    // ****************** MAP ************************

    val map = mapOf<Any, String>(1 to "Muhsan", "Ali" to "Javed" ,true to "Check")
//    val map = mapOf<Any>(1 to "Muhsan", 22 to "Ali", true)

//    println(map)
//
//    val mMap = mutableMapOf<Int, String>()
//
//    mMap.putAll(map)
//    mMap[1] = "Muhsan"
//    println(mMap)


    // ****************** ARRAYLIST ************************

    val arrNames = ArrayList<String>()

    arrNames.add("A")
    arrNames.add("B")
    arrNames.add("C")
    arrNames.add("D")

    arrNames[0] = "Muhsan"

    arrNames.remove("B")
    arrNames.removeAt(0)

    println(arrNames.toString())

}


class Collections {
}