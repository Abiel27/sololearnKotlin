class Userser {
    var name = ""

    var age = 0
        get() = field-1

        set(value) {
            if(value < 0) {
                field = 18
            }
            else {
                field = value
            }
        }
}
fun main(args: Array<String>) {
    val u = Userser()
    u.age = -4
    println(u.age)
}