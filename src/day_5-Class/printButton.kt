class Buttonerex( var width: Int, var height: Int) {
    //your code goes here
    var name = ""
    fun tap(){
        println("button was tapped")
    }
}
fun main(args: Array<String>) {
    val b1 = Buttonerex(200, 50)
    b1.name = readLine()!!

    b1.tap()
}
