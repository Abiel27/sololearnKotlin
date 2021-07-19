class Usererex(var name: String, var age: Int) {
    fun isAdult(): Boolean {
        if(age >= 18)
            return true
        else
            return false
    }

}
fun main(args: Array<String>) {
    var u = Usererex("James", 42)
    println(u.isAdult())
}