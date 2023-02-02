fun main(){
    class NonDataClass(val name: String, val email: String, val age: Int)
    data class DataClass(val name: String, val email: String, val age: Int)
    val non = NonDataClass("haneul", "age.com", 10)
    val data = DataClass("haneul", "age.com", 10)
    println("non data class toString : ${non.toString()}")
    pritnln("data class toString : ${data.toString()}")
}
