//Oftentimes when working with arrays,
//        there is a need to iterate through all of its elements.
//        This is easily done using a for loop.
//In the code above, the for loop is used to output all elements of
//        the array. During each iteration of the for loop the x variable
//        represents the current element of the nums array.
//        So, during the first iteration x will be 2, during the
//        2nd iteration - 4, and during the last one - 6.
fun main(args: Array<String>) {
        var nums = arrayOf(2, 4, 6)
        for (x in nums) {
        println(x)
        }
        }