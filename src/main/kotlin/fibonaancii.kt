 fun main() {
    val n = readInts("Enter the number of Fibonacci terms to display: ")

    println("Fibonacci series up to $n terms:")
    displayFibonacciSeries(n)

}
 fun readInts(prompt: String): Int {
     print(prompt)
     return readLine()?.toIntOrNull() ?: 0
 }
fun displayFibonacciSeries(n: Int) {
    var prev = 0
    var current = 1
    var count = 2 // Already printed the first two terms (0 and 1)

    if (n >= 1) {
        print("0")
    }
    if (n >= 2) {
        print(", 1")
    }

    while (count < n) {
        val next = prev + current
        print(", $next")
        prev = current
        current = next
        count++
    }

    println()


}

