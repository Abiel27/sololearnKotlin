abstract class Component1(width: Int, height: Int) {
    protected var width = width
    protected var height = height
    abstract fun show()
}
class Button1(width: Int, height: Int): Component(width, height) {
    private var name: String = "Button"
    fun show() {
        println("Showing a Button")}
    fun tap() {
        println(name + " was tapped")
    }

}
class Image(width: Int, height: Int): Component(width, height) {
    fun show() {
        println("Showing an Image")}
    fun draw() {
        println(width.toString()+"x"+height.toString())
    }

}
fun main(args: Array<String>) {
    val b1 = Button1(200, 50)
    b1.tap()
    b1.show()

    val img = Image(300, 500)
    img.draw()
    img.show()
}