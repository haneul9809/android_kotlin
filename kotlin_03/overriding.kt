open class Super{
    var superData = 10
    fun superFun(){
        println("i am superFun : $ superData")
    }
}
class Sub: Super()
fun main() {
    val obj = Sub()
    obj.superData = 20
    obj.superFun()
}
