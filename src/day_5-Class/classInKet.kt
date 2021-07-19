

class User(s: String, i: Int) {
    var name = ""
    var age = 0
}
fun main(args: Array<String>) {
    val u1 = constractorWithProperty("James", 42)
    u1.name = "James"
    u1.age = 42
    println(u1.age)
}
// This simple code has a class ans constractore with property,
// then the main function is called to create an object of the class.