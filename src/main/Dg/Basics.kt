fun main() {

//    var and val
//    val is constant
//    with datatype
//    var variableName:datatye = value
// datatpe : Int String
//    var variableName = value

//    val Pi = Math.PI
//    var r: Double = 10.0
//    var area = Pi*Math.sqrt(r)

//    calAreaOfCircle()

//    -----------------------------------------------
//    userInput
//    println("Enter base")
//    var base = readln().toInt()
//    println("Enter hight")
//    var hight = readln().toInt()
//
//    println(base)
//    println(hight)
//    area_of_triangle(b = base,h=hight)
//    -----------------------------------------------

    volumeOfSphere(10)

//    -----------------------------------------------

}
//    --------------------------------------------------------------------------------

//    function we can inside main or outside

// syntax fun functionName(parameter):return-types{}
fun calAreaOfCircle(r: Double) {
    val Pi = Math.PI
//    var ra: Double = 10.0
    var area = Pi * Math.sqrt(r)
    println(area)
}

// how to call a function: function name
//-------------------------------------------
fun areaOfTriangle(b: Int, h: Int) {
    var area = b * h / 2
    println(area)
}

//-------------------------------------------

//fun 4/3 pi r r r

//defualt arguments

fun volumeOfSphere(r:Int){
    var ft = 4/3
    var volume = ft * Math.PI * r * r * r
    println("ft $ft  r $r Math.PI${Math.PI}")
    println(volume)
}
