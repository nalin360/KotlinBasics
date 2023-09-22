import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a number: ")
    val number = scanner.nextInt()

    val factorial = calculateFactorial(number)

    println("Factorial of $number is $factorial")
}

fun calculateFactorial(n: Int): Long {
    if (n < 0) {
        return -1 // Factorial is not defined for negative numbers
    }
    var result: Long = 1
    for (i in 1..n) {
        result *= i.toLong()
    }
    return result
}


