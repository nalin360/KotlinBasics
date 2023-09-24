fun main() {

    println("Enter a number : ")
    var thenum = readln().toInt()

    var sum = 0
//    123 -> 321
    /*
    while thenum != 0
    123
    * dighit = 123 % 10 = 3
    * sum = 0
    *  sum = sum * 10 + digit
    * sum = 0 * 10 + 3
    * sum =3
    * thenum = 123 / 10 = 12
    * -------------------------
    thenum 12
    * dighit = 12 % 10 = 2
    * sum = 3
    * sum = sum * 10 + digit
    *sum = 3 * 10 + 2
    * 3
    * sum = 32
    * 12
    * thenum = 12 /10 = 1
    * -------------------------
    thenum 1
    * dighit = 12 % 10 = 1
    * sum = 32
    * sum = sum * 10 + digit
    *sum = 32 * 10 + 1
    *
    * sum = 321
    * 1
    * thenum = 1 /10 = 0
    thenum 0
    * */
    while (thenum != 0 ){
        var digit = thenum % 10
        sum = sum * 10 + digit
        thenum = thenum / 10
    }
//
    println("the reverse is $sum")
}