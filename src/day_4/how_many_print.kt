//How many numbers will the following code output?
fun main(args: Array<String>) {
var r = 2..6
for(x in r) {
    if (10 % x in r) {
        println(x)
    }
}}