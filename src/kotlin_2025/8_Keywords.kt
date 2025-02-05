package kotlin_2025
import java.util.ArrayList as SubList

fun main() {
    // as Keyword
    val ob: Any = "String"
    val strob: String = ob as String
    println(strob.length)

    val list = SubList<String>()
    list.add("Hello")
    list.add("World")
    list.add("António Adamu")
    list.add("Paula Ho")
    println(list)
    println(list::class.java.name)

    // in Keyword
    for (i in 0..10){
        println(i)
    }
    // is KEyword
}

interface MTInter<in T> {
    fun mtd(value: T)
}

interface MJInter<out T> {
    fun mtd(): T
}