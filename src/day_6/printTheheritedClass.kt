open class Component(var width: Int, var height: Int) {

}
class Buttonun(width: Int, height: Int) {
    var name: String = "Button"
    fun tap() {
        println(name + " was tapped")
    }

}


fun main(args: Array<String>) {
    val b1 = Buttonun(200, 50)
    b1.tap()
//
//    val img = Image(300, 500)
//    img.draw()
}