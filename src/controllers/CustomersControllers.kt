package controllers

import models.Customer


import utils.Printer

class CustomersControllers (private val printer: Printer) :IController{
    private val customerList = mutableListOf<Customer>(
Customer(
    "Julio",
    "Gonzalez",
    "Vela",
    "99813525",
    "Sm 243 Mz 34 lt 1",)


)

    override fun registerModel() {
       printer.apply {
           printMsg("Insert the names")
           val customerNames = readln()
           printMsg("Insert the first last name")
           val customerFirstLastName = readln()
           printMsg("Insert secondLastName")
           val secondLastName = readln()
           printMsg("Insert phone number")
           val phoneNumber = readln().toLong()
           printMsg("Insert address")
           val address = readln()


           val  addedCustomer = Customer(
               customerNames,
               customerFirstLastName,
               secondLastName,
               phoneNumber.toString(),
               address,

           )
           customerList.add(addedCustomer)
printMsg("We have a new customer")

       }
    }

    override fun showAllModels() {
        if (customerList.isEmpty()){
            printer.printMsg("We don't have any customer")

        }


    }

    private fun Customer(
        name: String,
        firstLastName: String,
        secondLastName: String,
        phoneNumber: String,
        address: String
    ): Customer {
        TODO("Not yet implemented")
    }

}