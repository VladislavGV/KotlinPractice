package ru.synergy.kotlinpractice

enum class Day {  //(val value: Int) {
   // MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7)

    MONDAY{
        val startHour = 6
        fun printName(){
            println("Доброе утро, понедельник")
        }
          }, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}