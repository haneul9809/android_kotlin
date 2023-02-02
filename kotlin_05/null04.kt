fun sme(data: String?): Int{
    return data!!.length
}
fun main(){
    println(some("haneul"))
    println(some(null))
}

// 결과
// 5
// Exception in thread "main" java.lang.NullPointerException
