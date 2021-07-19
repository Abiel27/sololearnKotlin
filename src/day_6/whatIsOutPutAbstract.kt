//What is the output of this code?
//
class Num(value:Int) {
    var v = value+2
        set(value) {
            field = value+v
        }
}
fun main(args: Array<String>) {
    val x = Num(3)
    x.v = 7
    println(x.v)
}
//Wait, how is the answer 12? We never called the setter function! Does it
//run automatically as a constructor? ( although it doesn't make sense...)
//Setting x.v to 7 should have made the answer 7, I'm confused? Oh, and congrats
//to you and me! Although this doesn't mean we are android Deva yet! Like any other
//language, we have to practice it and use it till we can fluently speak
//it! ^_^. Great job nevertheless! Now for the final sl 100XP practice question!