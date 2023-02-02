open class Super{
    var publicData = 10
    protected var protectedData = 10
    private var privateData = 30
}
class Sub: Super(){
    fun subFun() {
        publicData++
        protectedData++
        privateData++
    }
}
fun main() {
    val obj = Super()
    obj.publicData++ // 성공
    obj.protectedData // 오류
    obj.privateData// 오류
}
