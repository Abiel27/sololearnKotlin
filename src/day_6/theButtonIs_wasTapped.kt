class Buttonon(var width: Int, var height: Int) {
    //your code goes here
    var name: String = "Button"
    fun tap() {
        println(name + " was tapped")
    }
}

fun main(args: Array<String>) {
    val b1 = Buttonon(200, 50)
    b1.name = readLine()!!

    b1.tap()
}