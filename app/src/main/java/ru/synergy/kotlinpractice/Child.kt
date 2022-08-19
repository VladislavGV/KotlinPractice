package ru.synergy.kotlinpractice

data class Child(val name: String, val age: Int){
    override fun toString(): String {
        return "Name $name, age $age"
    }
}
