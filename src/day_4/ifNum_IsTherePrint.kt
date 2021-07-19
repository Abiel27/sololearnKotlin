fun main(args: Array<String>) {
//        Fill in the blanks to take a number as input
//                and output "Bingo" if it is in the range 50 to 100.
        var num = readLine()!!.toInt()
        if (num in 50..100) {
                println("Bingo")

        }
}