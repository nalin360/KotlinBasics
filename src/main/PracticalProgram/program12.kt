fun main() {
    /*
    * reverse a sentence using recursion
    * */
    println("Enter a sentence : ")
    var sentence = readln().toString()
    var result = reverseSentence(sentence)
    println(result)
}

fun reverseSentence(sentence: String): String {
    return when (sentence.length) {
        0 -> ""
        else -> sentence.last() + reverseSentence(sentence.substring(0, sentence.length - 1))
    }
}