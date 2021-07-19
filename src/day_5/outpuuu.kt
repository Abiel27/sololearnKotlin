//What is the output of this code?
//

fun apply(x: Int): Int {
    return x*x
}
fun main(args: Array<String>) {
    val arr = arrayOf(2, 3, 4)
    var res = 0
    arr.forEach {
        res += apply(it)
    }
    println(res)
}
//It will pass the values of the array "arr" to function apply
//as arguments and then it will add the results to
//variable "res" 0 + 2 * 2 = 4 0 + 3 * 3 = 9 0 + 4 * 4 = 16
//Then this is added to var res which has a value of 0 0 + 4 + 9 + 16 = 29 Answer: 29