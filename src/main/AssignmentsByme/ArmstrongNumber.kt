import kotlin.math.pow

fun main() {
    println("Enter a number :")
    var thenumbers = readln().toInt()
//-----------------------------------------
//    153 
    
    val numDigits = countDigitss(thenumbers) // power = 3
//    numDigits = 3
    var sum = 0
    var tempNumber = thenumbers // 153

    while (tempNumber > 0) { // 15 > 0
//        numdigit = 3
        var digit = tempNumber % 10 // 153 % 3 , 15 % 10 = 5
        sum += digit.toDouble().pow(numDigits).toInt()
        tempNumber /= 10
//        153 % 10 = 3
//        sum = sum + digit * pow(numDigit )
//             = 0 + 3 ^ 3
//                = 27
//        153 / 10 = 15
//        ---------------------------------
        /*
        * sum = sum + digit * pow(numDigit )
        * = 27 + 5 ** 3
        * = 27 + 125 =152
        * 153 / 10 = 1
        * */

        /*
        * sum = sum + digit * pow(numDigit )
        * = 152 + 1 ** 3
        * = 153
        * */


    }
// orihnal == temp
    if (thenumbers == sum){
        println("$sum is Armstrong number")
    }else{
        println("$thenumbers is not a Armstrong number")
    }


}

fun countDigitss(number: Int): Int {
    var count = 0
    var n = number // 153
    while (n != 0) { // n = 1 ,
        n /= 10// 1 / 10 = 3 , 5 , 1 0
        count++// c0unt ++ = 1 , 2 , 3
    }
//    3 
    return count
}