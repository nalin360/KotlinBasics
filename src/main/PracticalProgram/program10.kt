fun main() {
    val numberString = """
        1,2,3,4,5,6,7,8,9,0
    """.trimIndent()

    println(numberString)

    print("Enter number 1 : ")
    var inputNum1 = readln().toInt()
    print("Enter number 2 : ")
    var inputNum2 = readln().toInt()

    val opString = """
       | + | - | * | / | 
    """.trimIndent()

    println(opString)
    print("Enter what operation want to perform : ")
    var operation = readln().toString()
    var result = when(operation){
        "+" -> inputNum1 + inputNum2
        "-" -> inputNum1 - inputNum2
        "*" -> inputNum1 * inputNum2
        "/" -> inputNum1 / inputNum2
        else -> {"wrong operation"}
    }

    println("$inputNum1 $operation $inputNum2 is $result")

}