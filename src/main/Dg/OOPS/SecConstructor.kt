class SecConstructor(var name : String,var lastName:String) {

//    secondary constructor can not declare value only primary constructor
    constructor(name: String): this(name,"lastname"){
        println("2nd")
    }



}

fun main() {

    val user1 = SecConstructor("Nalin")
}