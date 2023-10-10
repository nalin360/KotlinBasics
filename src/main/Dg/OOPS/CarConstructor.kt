class CarConstructor(var brandName: String, var modelName: String) {
//    first way \/
//    var brand = brandName
//    var model = modelName

    fun getCarDetails() {
        println(
            "brand name : $brandName \n" +
                    "model nmae : $modelName" +
                    ""
        )
    }

    fun move() {
        println("Car is moving")
    }

    fun stop() {
        println("Car is stoped")
    }
}

class Users(name: String, var lastname: String, var age: Int) {

    //    Initializer Block
    /*
    * Initializer blocks are declared with the init keyword followed by curly braces.
    *  Write any code that you want to run within the curly braces.
    * During the initialization of an instance,
    * the initializer blocks are executed in the same order as they appear in the class body,
    *  interleaved with the property initializers:
    * */

    var names :String
    init {
        if (name.lowercase().startsWith("a")){
            this.names = name
        }else{
            this.names = "user"
            println("Name does not start with a ")
        }
    }
}

fun main() {
//    val cars1  = CarConstructor(brandName = "Toyota", modelName = "Supra");
//    cars1.getCarDetails()

    val user1 = Users("Nalin", "Shani", age = 24)

}