fun main() {
    val number = readInt("Enter a number: ")
    val reversedNumber = reverseNumber(number)
    println("Reverse of $number is $reversedNumber")
}

fun reverseNumber(number: Int): Int {
    var n = number
    var reversed = 0

    while (n != 0) {
        val digit = n % 10
        reversed = reversed * 10 + digit
        n /= 10
    }

    return reversed
}

fun readInt(prompt: String): Int {
    print(prompt)
    return readLine()?.toIntOrNull() ?: 0
}
