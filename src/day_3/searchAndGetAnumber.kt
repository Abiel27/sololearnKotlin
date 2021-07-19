fun main(args: Array<String>) {
    val x = 42
    if(x in 15..100) {
        println("Yes")
    }
    val xy = arrayOf(8, 9, 42, 111)
    if(42 in xy) {
        println("Yes;-) it does exist")
    }
//To iterate a number range which does not include
// its end element, use the until function: for (i in 1 until 5). In this case 5 is excluded.
}