package ru.synergy.kotlinpractice

class Car : Movable {
    override var speed: Int = 60


    override fun move() {
        println("Машина едет со скоростью 60 км/ч")
    }

}

class Aircraft: Movable {
    override var speed: Int = 600


    override fun move() {
        println("Самолет летит со скоростью 60 км/ч")
    }

    override fun stop() {
        println("Приземлился")
    }

}