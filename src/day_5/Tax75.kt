fun shippingCost(total: Double, international: Boolean): Double {

    if (international == false) {
        if (total >= 75.0) {
            return total*0.0
        }

        else if (total < 75.0) {
            return 0.10*total
        }
    }
    else if (international == true) {
        if ((total*0.15) > 50.0) {
            return 50.0

        }
        else{
            return 0.15*total

        }
    }
    return 0.0

}
fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()
    println(shippingCost(total, international))
}
//Shipping Calculator
//
//
//You are working on a eCommerce website and need to make a shipping
//cost calculator based on the order amount. bizhi
//The store uses the following cost structure:
//For orders in the US:
//- $75+ orders have free shipping  nexa
//- orders less than $75 have a shipping fee of 10% of the total order amount. aserte
//
//For international orders, there is a 15% shipping fee, with a maximum of $50.
//This means that the maximum shipping fee for an international order is $50.
//
//You need to complete the given shippingCost() function, which takes the order
//amount and a Boolean indicating whether the order is international or not, and returns the
// shipping cost for that order.
//The return amount should be a Double.
