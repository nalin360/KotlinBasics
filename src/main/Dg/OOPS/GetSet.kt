class GetSet(firstName: String, lastname: String) {
    /*
    * Getters and Seters
    *
    * */

    var firstName = firstName
        //    define getter and setter immediately after initialization
        get() {
            return "firstname $field"
        }
        set(value) {
            println("value $value")
            field = value
        }
    var lastname = lastname


}

fun main() {
    val obj1 = GetSet("Nalin","Sahani")
    println(obj1.firstName)
    obj1.firstName = "Singh"
}