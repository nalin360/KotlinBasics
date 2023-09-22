fun main() {
    /*
    * Function literals are functions that are not
    * declared but are passed immediately as an expression.
    * */
//    syntax
//    Lambda syntax: { argumentList -> body }
//    My Syntax (argName:argDataType) -> returnType {body}
//    We can also store it in variable
    val str: () -> String = { "s" }
    val number: () -> Int = { 1 + 3 }
    val num = number()
    println(num)

//    -------------
//    val checkGreater: () -> Boolean = {1 < 3}
    val checkGreater: (valueA: Int, valueB: Int) -> Boolean =
        { valueA, valueB ->
            valueA > valueB
        }

    val check = checkGreater(4, 5)
    println(check)
//    -------------
    var lambda = {a: Int , b: Int -> a + b }
    val hi = {vala: Int, valb:Int -> vala + valb}
//    -------------

//    -----------------------------------------------
// higher order function

    val add = {a: Int , b: Int -> a + b }
    fun higheradd(add:(Int,Int)-> Int): Int {
        return add(3,5)
    }

    var  result = higheradd(add)
    println(result)

//    -----------------------------------------------


//    -----------------------------------------------
//  factorial using higher order function
// 4 * 3 * 1
//    var fact = {numerical:Int -> numerical - 1}
    fun factorialUsingRecursion(num:Int) : Long {
    return if (num == 0 || num == 1) {
        1
    } else {
        num.toLong() * factorialUsingRecursion(num - 1)
    }
}
//    var nums = 5
//    val results = factorialUsingRecursion(nums)
//    println("Factorial of $nums is $results")
//    -----------------------------------------------
//    filter: Filters a collection based on a predicate.
//    reduce: Reduces a collection to a single value using a binary operation.
//    any: Checks if a collection contains an element that satisfies a predicate.
//    every: Checks if all elements of a collection satisfy a predicate.
//    Unit do not have any return types
//    Lambda function


}