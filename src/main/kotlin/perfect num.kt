fun main() {
    val lowerLimit = readIntss("Enter the lower limit of the range: ")
    val upperLimit = readIntss("Enter the upper limit of the range: ")

    println("Perfect numbers in the range $lowerLimit to $upperLimit are:")
    if (lowerLimit > upperLimit){
        println("")
    }
    for (number in lowerLimit..upperLimit) {
        if (isPerfectNumber(number)) {
            println(number)
        }
    }
}

fun isPerfectNumber(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    var sum = 1 // Start with 1 as the first divisor

    for (i in 2 until number) {
        if (number % i == 0) {
            sum += i
        }
    }

    return sum == number
}

fun readIntss(prompt: String): Int {
    print(prompt)
    return readLine()?.toIntOrNull() ?: 0
}
