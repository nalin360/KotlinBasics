fun main() {
    println("Enter a number :")
    var thenumbers = readln().toInt()
//    ---------------------------
    var result = 1
//    -------------------------
//    -1
    if (thenumbers < 0)
    {
        println("$thenumbers is less 0")
    }else{
        for (i in 1..thenumbers){
//            result = result * i
            result *= i
        }
    }

}