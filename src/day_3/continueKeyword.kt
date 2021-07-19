fun main(args: Array<String>) {
    var sum = 0
    var i = 1
    while (i<=100) {
        i++
        if(i%2 != 0) {
            continue
        }
        sum += i
    }
    println(sum)
}
//Let's use the continue statement to calculate the sum of only the even numbers: