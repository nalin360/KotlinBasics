fun main() {
    /*
    * convert binary to decimal
    * */
    // Get the binary number from the user.
    println("Enter a binary number: ")
    val binaryNumber = readLine()

    // Convert the binary number to decimal.
    val decimalNumber = binaryNumber?.toInt(2)

    // Print the decimal number.
    println("The decimal equivalent of $binaryNumber is $decimalNumber.")

}