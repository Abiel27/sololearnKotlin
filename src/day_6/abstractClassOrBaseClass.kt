abstract class Userbase(var name: String, var age: Int) {
}

class Adminbase(name: String, age: Int): Userbase(name, age) {
}

class Moderatorbase(name: String, age: Int, var country: String): Userbase(name, age) {
}

fun main(args: Array<String>) {
    val a = Moderator("James", 42, "USA")
    println(a.age)}

//Abstract classes are always open, so you do not need to use the open keyword.