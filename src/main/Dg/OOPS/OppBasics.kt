class OppBasics {
    var name = ""
    fun move(){
        println("Car is moving")
    }
    fun stop(){
        println("Car is stoped")
    }
}

fun main(){
    /*
    * crated an instance of class or object
    * */
    val car1 = OppBasics()

    car1.name = "tesla"
    println(car1.name)
    car1.move()
}