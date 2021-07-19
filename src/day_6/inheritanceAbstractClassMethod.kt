open class Component111(var width: Int, var height: Int) {

}
class ButtonButton(width: Int, height: Int): Component111(width, height) {
    var name: String = "Button"
    fun tap() {
        println(name + " was tapped")
    }
}
class Image11(width: Int, height: Int): Component111(width, height) {

    fun draw() {
        println(width.toString()+"x"+height.toString())
    }
}

fun main(args: Array<String>) {
    val b1 = ButtonButton(200, 50)
    b1.tap()

    val img = Image11(300, 500)
    img.draw()
}