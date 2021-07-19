


fun main(args: Array<String>) {
    var num = readLine()!!.toInt()
    var sum = 0;
    while (num != 0) {
        sum = sum + num % 10;
        num = num / 10;
    }
    print(sum);
}
//Finding the sum of the digits of a number is a popular coding challenge.
//Given a number as input, calculate and output its digit sum.
//
//Sample Input:
// 426
//
//Sample Output:
//12
//
//Hint: Use a while loop to iterate over the number. During each iteration
//add the last digit to the sum by dividing the number by 10 and taking the remainder
//(num % 10), then remove the last digit of the number by dividing it by 10 (num / 10).