fun main() {
    val max = getMax(5.0,6.0)
}
fun getMax(number1: Int, number2: Int): Int {
    return if (number1 > number2) number1 else number2
}
fun getMax(number1: Double, number2: Double): Double {
    return if (number1 > number2) number1 else number2
}