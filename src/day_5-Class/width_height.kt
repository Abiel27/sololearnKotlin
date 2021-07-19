// your code goes here
class Button(toInt: Int, toInt1: Int) {
    var width = 0
    var height = 0
}

fun main(args: Array<String>) {
    val b1 = Button(readLine()!!.toInt(), readLine()!!.toInt())
    b1.width = readLine()!!.toInt()
    b1.height = readLine()!!.toInt()

    println(b1.width+b1.height)
}