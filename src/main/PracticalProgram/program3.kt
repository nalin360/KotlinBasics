fun main() {
    print("Enter a year : ")
    var year : Int = readln().toInt()

    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        print("$year is a leap year")
    }else{
        println("its not a leap year ")
    }
}