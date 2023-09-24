/*
* Program entry point
An entry point of a Kotlin application is the main function.
* */
fun main(){
    val constnum : Int = 3213
//    constnum = 2
    var num_mut = 321
    println("Hello Worlds ")
    println("constNum is $constnum mut num is $num_mut ")
//    functions
    fun display(name:String){
        println(name)
    }
    display("nalin ")

    class Person {

        fun sayHi(name:String){
            println("Hiiiii $name")
        }
    }

    var pobj = Person()
    pobj.sayHi("nalin")
//    addition
    var n1 : Int = 20
    var n2 : Int = 20
    fun addition(n1:Int,n2:Int){
        println(n1+n2)
    }
    addition(n1,n2)
    for (i in 1..5) {
        println("Current number is $i")
    }
    var number = 1

    do {
        println("Number: $number")
        number++
    } while (number <= 3)

}


