package ru.synergy.kotlinpractice

class Person (_name: String){ // первичный конструктор
    private val name: String = _name
    var age: Int = 10 //mutable



    fun sayHello(){
        println("Hello my name is $name")
    }

    fun go(location: String){
        println("$name goes to $location")
    }

    fun personToString(): String{
        return "Name: $name, age: $age"
    }


}

