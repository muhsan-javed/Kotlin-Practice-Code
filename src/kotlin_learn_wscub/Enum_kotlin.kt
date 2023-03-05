package kotlin_learn_wscub

fun main() {

    println("Today is: "+ Days.MONDAY )

    for (day in Days.values()){
        if (day.holiday){
            println(" $day is a Holiday")
        }
    }

}
enum class Days(val holiday: Boolean = false) {
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY(true),
    SATURDAY
}

enum class Direction{
    EAST,WEST,NORTH,SOUTH
}

enum class Gender {
    FEMALE,
    MALE,
    OTHER
}