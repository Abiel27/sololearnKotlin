//Class Functions
//What is the output of this code?

class Tester(var num: Int) {
    fun calc() {
        println(num*2)
    }
}
fun main(args: Array<String>) {
    var x = Tester(3)
    x.calc()
}