import kotlin.math.pow

fun main() {
    val lowerLimit: Int = 1 // Set the lower limit of the range
    val upperLimit: Int = 10000 // Set the upper limit of the range

    println("Armstrong numbers in the range $lowerLimit to $upperLimit are:")


    for (number in lowerLimit..upperLimit) {
        if (isArmstrongNumber(number)) {
            println(number)
        }
    }
}

fun isArmstrongNumber(number: Int): Boolean {
    val numDigits = countDigits(number)
    var sum = 0
    var originalNumber = number

    while (originalNumber > 0) {
        val digit = originalNumber % 10
        sum += digit.toDouble().pow(numDigits).toInt()
        originalNumber /= 10
    }

    return sum == number
}

fun countDigits(number: Int): Int {
    var count = 0
    var n = number
    while (n != 0) {
        n /= 10
        count++
    }
    return count
}
