fun main() {
    println("Enter a number : ")
    var inputsfromUser = readln().toInt()
    var result = 1
//    untill will exclude the inputsfromUser
    for (i in 2 until  inputsfromUser){
        if ( inputsfromUser % i == 0 ){
            result += i
        }
    }
    if (inputsfromUser == result){
        println("$result is a prime number")
    }

}