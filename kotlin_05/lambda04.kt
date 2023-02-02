typealias MyFunType = (Int, Int) -> Boolean

fun main() {
    val someFun: MyFunType = {no1: Int, no2: Int ->
        no1 > no2}
    println(someFun(10, 20))
    println(someFun(10, 20))
}
