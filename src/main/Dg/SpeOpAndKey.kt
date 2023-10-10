fun main() {
    // Get user input for two boolean values
    print("Enter the first boolean value (true or false): ")
    val input1 = readLine()?.toBoolean() ?: false

    print("Enter the second boolean value (true or false): ")
    val input2 = readLine()?.toBoolean() ?: false

    // Logical AND
    val resultAnd = input1 && input2
    println("Logical AND: $input1 && $input2 = $resultAnd")

    // Logical OR
    val resultOr = input1 || input2
    println("Logical OR: $input1 || $input2 = $resultOr")

    // Logical NOT
    val resultNotInput1 = !input1
    val resultNotInput2 = !input2
    println("Logical NOT for input1: !$input1 = $resultNotInput1")
    println("Logical NOT for input2: !$input2 = $resultNotInput2")
}
