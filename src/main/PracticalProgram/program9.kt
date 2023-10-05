fun main(args: Array<String>) {
    val primes = mutableListOf<Int>()

    // Check if a number is prime
    fun isPrime(n: Int): Boolean {
        for (i in 2 until n) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }

    // Iterate through all numbers from 1 to 100 and add all prime numbers to a list
    for (i in 1..100) {
        if (isPrime(i)) {
            primes.add(i)
        }
    }

    // Print all prime numbers
    println("The prime numbers from 1 to 100 are:")
    println(primes)
}