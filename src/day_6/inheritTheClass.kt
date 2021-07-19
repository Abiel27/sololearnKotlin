open class Userer(var name: String, var age: Int) {
        }
        class Admin(name: String, age: Int): Userer(name, age) {
        }
        class Moderator(name: String, age: Int, var country: String): Userer(name, age) {
        }
        fun main(args: Array<String>) {
        val b = Moderator("Amy", 23, "USA")
        println(b.country)
        }
//When working with inheritance, each derived class should have an
//"is a" relationship with the base class. In our example, Moderator is a User, Admin is a User.
//However, you cannot have something like Student is a Color, so, in that case,
//inheritance should not be applied.