package models

class Employee(
    name: String,
    firstLastName: String,
    secondLastName:String,
    phoneNumber: String,
    val RFC: String,
    val salary: String,
    val type: String
) : Person(
    name,
    firstLastName,
    secondLastName,
    phoneNumber,

) {
    override fun printPersonType() {
        println(" I will be the one to help you ${getFullName()}")

    }
}

