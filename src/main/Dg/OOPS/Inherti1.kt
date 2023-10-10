
open class Inherti1(p:Int) {

    /*
    * The overriding mechanism works on properties
    * in the same way that it does on methods.
    * */
    open val vertexCount: Int = 0
    // ------------------------------------------------------------
    /*
    * By default, Kotlin classes are final – they can't be inherited.
    * To make a class inheritable, mark it with the "open" keyword:
    * */

    /*
    * making function open so it can be overide
    * */
    open fun showMe(){
        println("Its function of Inheri1")
    }
    // ------------------------------------------------------------
    open fun draw() { println("Drawing a rectangle") }
}

class Derived(p:Int) : Inherti1(p){

    override val vertexCount = 4

    // ------------------------------------------------------------
    /*
    * If the derived class has a primary constructor,
    * the base class can (and must) be initialized in
    * that primary constructor according to its parameters.

    * Kotlin requires explicit modifiers for overridable members and overrides:

    * The "override" modifier is required for Inherti1.showMe()
    */

    override fun showMe(){
        println("Derived class function")
    }
    /*
    * A member marked "override" is itself open,
    * so it may be overridden in subclasses.
    * If you want to prohibit re-overriding, use "final"
    * */
    // ------------------------------------------------------------

    /*
    * Calling the superclass implementation
    * Code in a derived class can call its superclass
    * functions and property accessor implementations
    * using the "super" keyword:
    *
    * */

    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }
}
fun main() {
    val d1 = Derived(4)
    d1.showMe()
    d1.draw()
}