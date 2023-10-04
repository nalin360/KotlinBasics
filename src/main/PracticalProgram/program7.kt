fun main() {
/*
* to reverse a number
* */
    var n = 123
    var sum = 0
    while (n != 0){
        var lastdigit = n % 10
        sum = sum * 10 + lastdigit
        n /= 10
    }
    
    print(sum)
}