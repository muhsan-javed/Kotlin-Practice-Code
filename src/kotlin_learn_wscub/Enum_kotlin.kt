package kotlin_learn_wscub

fun main() {
    /*
              ********************  Enum Kotlin *********************************
    => In programming, sometimes there arises a need for a type to have only certain values.
    => To accomplish this, the concept of enumeration was introduced. Enumeration is a named list of constants.
    => In Kotlin, like many other programming languages, an enum has its own specialized type, indicating that something has a number of possible values.
    => Enum constants aren't just mere collections of constants-these have properties, methods etc.
    => Each of the enum constants acts as separate instances of the class and separated by commas.
    => Enums increases readability of your code by assigning Pre defined names to constants.
    */

    println("Today is: " + Days.MONDAY)

    for (day in Days.values()) {
        if (day.holiday) {
            println(" $day is a Holiday! ")

        }
    }

}

enum class Days(val holiday: Boolean = false) {
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true)
}

enum class Direction {
    EAST, WEST, NORTH, SOUTH
}

enum class Gender {
    FEMALE,
    MALE,
    OTHER
}