package ru.synergy.kotlinpractice

interface Movable {
    var speed: Int
    fun move()
    fun stop(){
        println("Остановка")
    }
}