fun main() {

    /*
    * to generate multiplication table
    * */
    print("Enter a number");
    var number = readln().toInt();

    for (i in 1..10){
        var result = i * number
        println("$i * $number = $result")
    }
}