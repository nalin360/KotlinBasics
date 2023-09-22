
fun main() {
    println("Enter a number : ")
    var n11 = readln()
    var num:Int =n11.toInt()
    var lowernumber: Int = 0
    var sum = lowernumber
    for (number in lowernumber..num){ // 0..5
        sum += number // sum = sum + number
//        println(sum)
    }
    println("sum of the number is  $sum")
}