fun main() {
    println("Enter a number : ")
    var inputsfromUser = readln().toInt()
    var result = 1 // 1
//-------------------------------------
//    untill will exclude the inputsfromUser
//2..6 => 1,2,3,4,5,6 | until 2,3,4,5
//    2 ... 5
    for (i in 2 until  inputsfromUser){ //
        if ( inputsfromUser % i == 0 ){ // 6 % 5 == 0
            result += i
//            result = result + i
            /*
            * result = 1 + 2
            * result = 3
            * --------------------------
            * r = 3 + 3
            * r = 6
            * */

        }
    }
    if (inputsfromUser == result){ // 6 == 6
        println("$result is a perfact number")
    }else{
        println("$result not a perfact number ")
    }

}