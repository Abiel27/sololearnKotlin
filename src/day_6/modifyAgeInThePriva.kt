class Userin(var name: String, private var age: Int) {
    fun getAge():Int {
        if(age < 18)
            return 18
        else
            return age
    }
    fun setAge(a: Int) {
        if(a < 0)
            age = 18
        else
            age = a
    }
}
fun main(args: Array<String>) {
    val u1 = Userin("Amy", 23)
    u1.setAge(42)
    println(u1.getAge())
}