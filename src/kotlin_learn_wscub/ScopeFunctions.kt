package kotlin_learn_wscub


fun main() {

    var name: String = "Muhsan"

    name.let {
        println("The lenght of the name is: $it?.length")
        println("The name is: "+ it)
        println("The reversed name is: "+ it?.reversed())

    }

    val user: User?  = null

    val age = user?.run{
        println("The name if user is ${user.name}")
        age
        "Run Scope Function"
    }
    println("Msg is: $age")

//    val user = User().apply {
//        name = "Muhsan"
//        age = 50
//        this.mobileNumber = 06874564.4
//
//    }

//    val age = with(user){
//        println("The name if user is ${user.name}")
//        age
//    }
//    println("The age of user is $age")

//    user.also {
//        it.name = "Uzair"
//        it.age = 100
//        println("The Name Hsa Changed !")
//    }
//
//    println("The Name is : ${user.name}")


}

class User{
    var name: String = "Muhsan javed"
    var age : Int = 20
    var mobileNumber: Double = 00.10

}

class ScopeFunctions {

}