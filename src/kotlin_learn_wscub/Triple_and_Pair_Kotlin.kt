package kotlin_learn_wscub

class Triple_and_Pair_Kotlin {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            println("Hello Triple Pari")

            val (nameId,age) = Pair("Muhsan", 20)
            val name = Pair("Uzair", Pair("Javed" , Pair("Muhsan", 1)))

            println("${name.first} ${name.second}  ${name.second.second.first}  ${name.second.second.second}")

//            val number = Triple("Hello","World", Triple(1, "a" Triple("A","B", true)))


//            val (x,y,z) = Triple("Hello","World!",1)
//            println("$x $y $z")
            val number = Triple("Hello","World!",1)

            println("$number")

        }
    }
}