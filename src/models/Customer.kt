package models
class Customer(
    name: String,
    firstLastName: String,
    secondLastName: String,
    phoneNumber: Long,
    val address: String,
    RFC: String,
    param: Any?
) : Person(
    name,
    firstLastName,
    secondLastName,
    phoneNumber.toString()
){
    override fun printPersonType() {
        println("hello I am the client ${getFullName()}")
    }


}
