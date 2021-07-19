//apply is a higher-order function which takes an integer and a function
//named action as its arguments.
//Then it calls the action function on its integer argument and returns the result.
//
//Now we can call our apply function and pass it different anonymous
//functions as the action argument:
fun apply(x:Int, action: (Int) -> Int): Int {
    return action(x)
}

fun main(args: Array<String>) {
    println(apply(4, {x -> x*2}))
    println(apply(4, {x -> x/2}))
}