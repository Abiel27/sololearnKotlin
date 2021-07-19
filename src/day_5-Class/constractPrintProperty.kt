class Userex(var name: String, var age: Int) {
    fun login() {
        println("Login from user " + name)
    }
}
fun main(args: Array<String>) {
    var u = Userex("James", 42)
    u.login()
}