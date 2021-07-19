//when
//As the complexity of your conditional statement grows, you can replace the
//if/else expressions with a when expression, as shown in the following example:

fun main(args: Array<String>) {
    val num = -7

    val result = when {
        num > 0 -> "Positive"
        num < 0 -> "Negative"
        else -> "Zero"
    }
    println(result)
}