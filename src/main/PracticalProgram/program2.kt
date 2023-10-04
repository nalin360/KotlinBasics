fun main() {

    /*
    * to find vowel or constant
    * */
    println("Enter a char")
    var str: String = readln().toString();
    if(str == "a" || str == "e" || str == "i" || str == "o"|| str == "u"){
        println("$str is vowel")
    }else{
        println("$str its a constant")
    }
}