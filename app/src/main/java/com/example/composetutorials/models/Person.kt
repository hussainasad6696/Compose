package com.example.composetutorials.models

class Person(val uuid: String,val name: String, val age: Int)

class PersonRepo {
    val allData: List<Person>
    get() {
        return listOf(
            Person("0", name = "hussain",26),
            Person("1", name = "asad",50),
            Person("2", name = "zeenia",24),
            Person("3", name = "ather",60),
            Person("4", name = "shahida",45),
            Person("5", name = "duaa",25),
            Person("6", name = "fatima",18),
            Person("7", name = "anaya",1),
            Person("8", name = "usayd",0),
        )
    }
}