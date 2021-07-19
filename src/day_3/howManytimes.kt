//How many numbers will the following code output?
fun main(args: Array<String>) {
    var i = 5
    while (i > 0) {
        if (i == 2) {
            break
        }
        println(i)
        i--
    }
}