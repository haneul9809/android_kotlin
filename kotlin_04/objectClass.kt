val obj = object {
    var data = 10
    fun some() {
        println("data : $data")
    }
}
fun main() {
    obj.data = 20
    obj.some()
}
