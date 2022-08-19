package ru.synergy.kotlinpractice

open class Person( val name: String) {   //(_name: String){

//    val name: String = _name
//    var age: Int = 0
//    var company: String = "Undefined"
//
//    constructor(_name: String, _age: Int): this(_name) {
//        age = _age
//    }
//
//    constructor(_name: String, _age: Int, _comp: String): this(_name,_age){
//        company = _comp
//    }

//    fun sayHello(){
//        println("Hello my name is $name")
//    }
//
//    fun go(location: String){
//        println("$name goes to $location")
//    }
//
//    fun personToString(): String{
//        return "Name: $name, age: $age"
//    }

    fun printName(){
        print(name)
    }
}

class Employee (empName: String, private var company: String): Person(empName) {
    private var age: Int = 10
    set(value: Int){
        if((value>0) and (value<110))
            field = value
    }

    private val day: Day = Day.MONDAY

    val fullInformation: String
    get() = "$name $age $company"



    fun printCompany(){
        println(company)

        day.name
        day.ordinal // 5

    }


}

