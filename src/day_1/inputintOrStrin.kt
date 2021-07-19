/*
readLine() returns the input as a string, even if the user enters a number.
So how do we take numbers as input?
We need to convert the input to the
 corresponding type. For example, to convert to Int we need to use toInt():
 */
fun main(args: Array<String>) {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println(a+b)
}