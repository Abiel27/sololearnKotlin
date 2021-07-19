fun main(args: Array<String>) {
    var num = readLine()!!.toInt()
    var sum = 0;

    while (num != 0) {
        sum = sum + num % 10;
        num = num / 10;
        print(sum)

    }
}