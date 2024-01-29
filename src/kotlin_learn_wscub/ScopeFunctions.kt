package kotlin_learn_wscub


fun main() {
    /*             ********************  Scope Functions Kotlin *********************************
    => The Kotlin standard library contains several functions whose sole purpose is to execute a block of code within the context of an object.
    => When you call such a function on an object with a lambda expression provided, it forms a temporary scope.
    => In this scope, you can access the object without its name.

     TYPE of SCOPE FUNCTIONS
        with-> Return: Lambda result | Context object: this
        let->  Return: Lambda result | Context object: it
        run->  Return: Lambda result | Context object: this

        apply-> Return: context object | Context object: this
        also->  Return: context object | Context object: it

       */

    // let

    var name: String? = "Muhsan"
    name?.let {
        println("The lenght of the name is: ${it.length}")
        println("The name is: $it")
        println("The reversed name is: " + it.reversed())

    }

    val user = User()

    // run
    val run = user?.run {
        println("The name if user is ${this.name}")
        age
        "Run Scope Function"
    }
    println("Msg is: $run")

    // with
    val ageWith = with(user){
        println("The name if user is ${user.name}")
        age
    }

    println("The age of user is $ageWith")

    // apply
   /* val user = User().apply {
        name = "Muhsan"
        age = 50
        this.mobileNumber = 06874564.4
    }*/

    // also
   /* user.also {
        it.name = "Uzair"
        it.age = 100
        println("The Name Hsa Changed !")
    }

    println("The Name is : ${user.name}")*/


}

class User {
    var name: String = "Muhsan javed"
    var age: Int = 20
    var mobileNumber: Double = 00.10
}

class ScopeFunctions {

}