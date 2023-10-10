fun main() {
    /*
    * https://kotlinlang.org/docs/null-safety.html#nullable-types-and-non-nullable-types
    *
    *
    * */
    val sa = null
//    val st: String = null // throws an error : Null can not be a value of a non-null type String
    val str: String? = null
    if (str != null){
        println(str.length)
    }

    val text = str ?: "if str is not null it this string will be asign to text"

    println(text)
}
