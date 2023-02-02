class User(val name: String, val count: Int){
    fun someFun() {
        println("name : $name, count : $count") //성공
    }
}
fun main() {
    val user = User("haneul", 10)
    user.someFun()
}
