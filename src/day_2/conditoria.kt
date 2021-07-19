//You can combine multiple conditions in if/when statements using the
// logical and && and or || operators.
//For example, let's check if the value of num is in a certain range:
//Both conditions should be true for the && operator to evaluate to true.
//Similarly, the or || operator can be used to check
// if any one of the conditions is true
fun main(args: Array<String>) {
    var num = 42
    if (num >= 18 && num <= 60) {
        println("Yes")
    }

        var name = "Abiel"
        if (name == "Rahwa" || name == "Abiel") {
            println("Kude")
        }
    }
