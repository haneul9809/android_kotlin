fun main() {
    fun sum(no: Int):Int {
        var sum = 0
        for(i in 1..no){
            sum += i
        }
        return sum
    }

    val name: String = "kkang"
    println("name : $name, sum : ${sum(10)}, plus : ${10 + 20}")
}
