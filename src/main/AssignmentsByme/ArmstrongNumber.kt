import kotlin.math.pow

fun main() {
    println("Enter a number :")
    var thenumbers = readln().toInt()

    val numDigits = countDigitss(thenumbers)
    var sum = 0
    var originalNumber = thenumbers

    while (originalNumber > 0) {
        val digit = originalNumber % 10

        sum += digit.toDouble().pow(numDigits).toInt()
        originalNumber /= 10
    }

    if (thenumbers == sum){
        println("$sum is Armstrong number")
    }else{
        println("$thenumbers is not a Armstrong number")
    }


}

fun countDigitss(number: Int): Int {
    var count = 0
    var n = number
    while (n != 0) {
        n /= 10
        count++
    }
    return count
}