class Person {
    var employeeNumber: Int  = 0
    var employeeName: String = ""
    var employeeSalary: Int = 0
    var employeeDate: String = ""

    fun greet() {
        println("Hello, my name is $employeeName " +
                "and my number is $employeeNumber " +
                "my monthly salary is $employeeSalary " +
                "and date of joining is $employeeDate.")
    }

}

fun main() {
    val person = Person()
    print("Enter your name: ")
    person.employeeName = readln()
    print("Enter your employee number: ")
    person.employeeNumber = readln().toInt()
    print("Enter your salary: ")
    person.employeeSalary = readln().toInt()
    print("Enter your date of joining: ")
    person.employeeDate = readln()

    person.greet()
}
