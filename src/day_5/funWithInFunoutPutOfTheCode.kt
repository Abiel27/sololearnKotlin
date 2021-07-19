//What is the output of this code?
//

    fun f(x: String): Int {
        var z = 0
        for (a in x) {
            z++
        }
        return z
    }

    fun main(args: Array<String>) {
        println(f("hello"))
    }

