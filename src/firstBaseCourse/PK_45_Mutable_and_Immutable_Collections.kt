fun main() {

    // list map set
    var list = listOf("Pakistan", "India", "UK", "UAE", "Bangladesh", "Iceland")
    for (x in list) {
        println(x)
    }

    var list1 = listOf(123, 456, 789, "Pakistan", "Muhsan Javed")
    for (y in list1) {
        println(y)
    }

    var list2 = mutableListOf("Pakistan and India", "Iceland and AVG")
    list2.add("China")
    list2.add("Bangladesh")
    for (a in list2) {
        println(a)
    }

}