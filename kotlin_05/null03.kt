fun main() {
    var data: String? = "haneul"
    println("data = $data : ${data?.length ?: -1}")
    data = null
    println("data - $data : ${data?.length ?: -1}")
}
// 결과
// data = haneul : 5
// data = null : -1
