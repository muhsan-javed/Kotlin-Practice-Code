package kotlin_2025.oops

interface MyInter
{
    val p1:String
    fun m1()
    fun m2(){
        println("this is interface m2 method")
    }
}

interface Cloneable{
    fun clone()
}
class child1 : MyInter, Cloneable
{
    override val p1:String = "this is property of p1 in child1"


    override fun m1() {
        println("child1 class m1 method")
    }

    override fun clone() {
        println("clone method interface")
    }

}

fun main() {

    val inter = child1()
    inter.m1()
    inter.m2()
    inter.clone()
    println(inter.p1)

}