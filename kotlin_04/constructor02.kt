class User{
    constructor(name: String){
        println("constructor(name: String) call...")
    }
    constructor(name: String, count: Init) {
        println("constructor(name: String, count: Int) call...")
    }
}
fun main() {
    val user1 = User("haneul")
    val user2 = User("haneul", 10)
}
