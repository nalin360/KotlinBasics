fun main() {
    val myName:String = "Nalin"
    sayHello(myName)
    val myValue = getMaxValue(2,4)
    println(myValue)

    println(takeManyArg(1,2,3,4,5,6,7,7))
}

fun sayHello(name:String){
    println("hi its me $name")
}

// return type
fun getMaxValue(number1: Int, number2: Int): Int {
    return if (number1 > number2) number1 else number2
}
// default parameters
fun sendMessage(message: String = "Message received"){
    println(message)
}
// varArg if we have many parameter

fun takeManyArg(vararg number: Int):Int{
    var results = 0
    for (num in number){
        results += num
    }

    return results
}

