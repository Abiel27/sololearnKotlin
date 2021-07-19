//Constructors
//What is the output of this code?

class Test {
    var x = 1
    constructor(v: Int) {
        x = v-2
    }
}
fun main(args: Array<String>) {
    val t = Test(8)
    println(t.x)
}