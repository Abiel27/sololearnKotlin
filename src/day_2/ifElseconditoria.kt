
//Combining Conditions

fun main(args: Array<String>) {
    var age = readLine()!!.toInt()
    var print = when{
        age>0 && age<11 -> print("Child")
        age>12 && age<17 -> print("Teen")
        age>18 &&  age<64 -> print("Adult")
        age>65 -> print("Senior")
        else-> print("Invalid age")
    }
}