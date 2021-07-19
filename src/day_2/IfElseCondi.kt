fun main(args: Array<String>) {
    var age = 12
    if (age >= 18) {
        println("Welcome")
    }
    else {
        println("Not allowed")
    }
    // it is meant to end here but for the sake of training, I have added this belo
    //to try if additional block can work in together, with the above part.

    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println(a+b)
}