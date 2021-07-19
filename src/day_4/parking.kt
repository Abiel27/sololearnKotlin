
fun main(args: Array<String>) {
var hours = readLine()!!.toInt()
var total: Double = 0.0

if (hours <= 5) {
    total = hours * 1.0
} else if (hours > 5 && hours < 24) {
    total=5+((hours-5)*0.5)
} else {
    total= (15 * hours / 24) + (0.5 * hours % 24)
}

println(total)
}