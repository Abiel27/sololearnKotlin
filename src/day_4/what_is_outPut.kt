//What is the output of this code?
//
fun main(args: Array<String>) {
    var x = 8
    val y = when {
        x > 10 -> x - 1
        x > 5 -> x + 1
        else -> x
    }
    print(y + x)
}
