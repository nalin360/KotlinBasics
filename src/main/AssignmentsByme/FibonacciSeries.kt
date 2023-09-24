fun main() {
    var prev = 0
    var current = 1
    var count = 2 // Already printed the first two terms (0 and 1)
//----------------------------------
    println("Enter a number : ")
    val n = readln().toInt()
//--------------------------------------------
    if (n >= 1) {
        print("0")
    }
    if (n >= 2) {
        print(", 1")
    }
//    manualy
//-------------------------------------------------------------------

    while (count < n){
        val next = prev + current
        print(", $next")
        prev = current
        current = next
//        0 1, 1,2,3,5,8
        count++
//        count = 5
    }
}