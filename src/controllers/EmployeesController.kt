package controllers

import models.Employee
import utils.Printer

class EmployeeController (private val printer: Printer) : IController {
    private val employeeList = mutableListOf<Employee>(
        Employee(
            "Cesar",
            "Huerta",
            "Perez",
            "99813525",
            "4d5e6789",
            "$12434",
            "delivery person",)







    )

    override fun registerModel() {
        printer.apply {
            printMsg("Inset name")
            val employeeName = readln()
            printMsg("Insert first last name")
            val employeeFirstLastName = readln()
            printMsg("Insert second last name")
            val employeeSecondLastName = readln()
            printMsg("Insert phone number")
            val employeePhoneNumber = readln()
            printMsg("How much you earn per hour")
            val employeeSalary = readln()
            printMsg("What is your role")
            val employeeType = readln()

            val addedEmployee = Employee(
                employeeName,
                employeeFirstLastName,
                employeeSecondLastName,
                employeePhoneNumber,
                employeeSalary,
                employeeType)

            employeeList.add(addedEmployee)






            )

        }
    }

    override fun showAllModels() {
        if (employeeList.isEmpty()){
            printer.printMsg("We have no employees available")
        }


    }

}