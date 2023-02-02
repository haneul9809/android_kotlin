open class Super{
    open var superData = 10
    open fun superFun(){
        println("i am super class Function : $ superData")
    }
}
class Sub: Super(){
    override var someData = 20
    override fun someFun(){
        println("i am sub class function : $someData")
    }
}
fun main() {
    val obj = Sub()
    obj.superFun()
}
