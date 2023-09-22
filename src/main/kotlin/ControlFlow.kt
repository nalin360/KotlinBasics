class ControlFlow {


}

fun main() {
    val min:Int =  10;

    if (min == 10 ){
        println("$min")
    }
//    pre and post increment
    var inn:Int = 10
    println(inn++)
    println(inn)
    println(++inn)
//    logical operator
//    && || !
//    range (..)
    val n =5
    val res1 = n in 1..5
    println(res1)
    val res2 = n in 1 until  5
//    it will count upto one to four
    println(res1)
//
    println("When")
//    val n =5
    val chck = when (n){
        1-> "one"
        2-> "two"
        3-> "three"
        else -> "Not in range"
    }

    println(chck)
//how to take user input
//    note we can also use scanner class
//   meathod one
    println("How to take user input ")
    println("Enter a number : ")
var n11 = readln()
var num:Int =n11.toInt()
    var i = 1
    while (i <= 10)
    {
        println(num * i)
        i++
    }

    var ind = 5

    do {
        println("do some thing ")
    }while (ind>5)

//    for loops

    for (i in 1..5 step 2){
        println(i)
    }
}
// using do while loop

