fun main(args: Array<String>) {
    var sum = 0
    var i = 1
    while (i<=100) {
        sum += i
        i++
        if(sum > 1000) {
            break
        }
    }
    println(sum)
}
//The break statement can be used to stop a loop prematurely.
//For example, let's stop the while loop
//that calculates the sum of the numbers as soon as the sum value becomes greater than 1000:
//A break statement can also be used to stop an infinite loop
//when a certain condition is met. An example infinite loop is while(true)