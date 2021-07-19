class contra {
    var name = ""
    var age = 0
    constructor(nm: String) {
        name = nm
    }
    constructor(nm: String, a: Int) {
        name = nm
        age = a
    }
}
fun main(args: Array<String>) {
    val u1 = contra("James", 42)
    val u2 = contra("Amy")
    println(u1.name)
    println(u2.name)
}