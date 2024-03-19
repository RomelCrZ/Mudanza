package models

abstract class Person(
    private val name: String,
    private val firstLastName: String,
    private val secondLastName: String,
    val phoneNumber: String

){
    fun getFullName ():String{
        return "$name $firstLastName $secondLastName"
    }
abstract fun printPersonType()
}
