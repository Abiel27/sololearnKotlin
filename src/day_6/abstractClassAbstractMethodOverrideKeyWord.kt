abstract class Component11(width: Int, height: Int) {
    protected var width = width
    protected var height = height
    abstract fun show()
}
class Button11(width: Int, height: Int): Component11(width, height) {
    private var name: String = "Button"
    override fun show() {
        println("Showing a Button")}

    fun tap() {
        println(name + " was tapped")
    }

}
class Image1(width: Int, height: Int): Component11(width, height) {
    override fun show() {
        println("Showing an Image")}
    fun draw() {
        println(width.toString()+"x"+height.toString())
    }

}
fun main(args: Array<String>) {
    val b1 = Button11(200, 50)
    b1.tap()
    b1.show()

    val img = Image(300, 500)
    img.draw()
    img.show()
}
//The best of all time abstract class and abstract method, with overide key function method