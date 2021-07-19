
//We can use a while loop to calculate the sum of numbers from 1 to 100:
//
fun main(args: Array<String>) {
    var sum = 0
    var i = 1
    while (i<=100) {
        sum += i
        i++
    }
    println(sum)
}