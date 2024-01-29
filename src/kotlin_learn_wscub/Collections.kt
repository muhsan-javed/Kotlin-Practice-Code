package kotlin_learn_wscub


fun main() {
    /******************* Collections ************************
        => A collection usually contains a number of objects (this number may also be zero) of the same type.

        => Objects in a collection are called elements or items.

        => For example, all the students in a department form a collections that can be used to calculate their average age.


    The following collection types are relevant for Kotlin:
        -> List
            1. It is an ordered collection with access to elements by indices - integer numbers that reflect their position.
            2. Elements can occur more than once in a list.
            3. An example of a list is a sentence: it's a group of words, their order is important, and they can repeat.

        -> Set
            1. It is a collection of unique elements.
            2. It reflects the mathematical abstraction of set: a group of objects without repetitions.
            3. Generally, the order of set elements has no significance, For example, an alphabet is a set of letters.

        -> Map
            1. It (or dictionary) is a set of key-value pairs.
            2. Keys are unique, and each of them maps to exactly one value.
            3. The values can be duplicates.
            4. Maps are useful for storing logical connections between objects, for example, an employee's ID and their position.

        -> Set
     **/


                    // ****************** LIST ************************
    val list = listOf("Muhsan", "uzair", "Brohi", 2, true, listOf(1, 2, 3))
    println(list)

    val mList = mutableListOf<Any>("Muhsan", 40)
    mList.add(0, "Muhsan")
    mList.add("Sahib Khan")
    mList.add(10)

    val mAlist = mutableListOf("Pawna", false)
    mList.addAll(mAlist)

    println()
    println(mList)

                    // ****************** SET ************************
    val set = setOf("12", 545, "Muhs")
    print(set)

    val mset = mutableListOf<Any>("Ali", 5550, "has", 1, false)
    mset.add(true)
    mset.add("Hi")
    print(mset)

                    // ****************** MAP ************************

    val map = mapOf<Any, String>(1 to "Muhsan", "Ali" to "Javed", true to "Check")
//    val map = mapOf<Any>(1 to "Muhsan", 22 to "Ali", true)

//    println(map)

    val mMap = mutableMapOf<Any, String>()

    println("\n")
    mMap.putAll(map)
    mMap[1] = "Brohi"
    println(mMap)


                    // ****************** ARRAYLIST ************************

    val arrNames = ArrayList<String>()

    arrNames.add("A")
    arrNames.add("B")
    arrNames.add("C")
    arrNames.add("D")

    arrNames[0] = "Muhsan"

    arrNames.remove("B")
    arrNames.removeAt(0)

    println("\n")
    println(arrNames.toString())

}


class Collections {
}