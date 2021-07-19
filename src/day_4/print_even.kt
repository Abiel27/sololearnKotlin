//Fill in the blanks to output only the even numbers in the array.
fun main(args: Array<String>) {
    var arr = arrayOf(1, 2, 5, 6, 2, 8, 9)
    for (x in arr) {
        if (x % 2 != 0) {
            continue
        }
        println(x)

    }
}
