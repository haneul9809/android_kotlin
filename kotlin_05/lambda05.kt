fun hofFun(arg: (Int) -> Boolean: () -> String){
    val result = if(arg(10)) {
        "valid"
    } else {
        "invalid"
    }
    return {"hoFun result : $result"}
}
fun main() {
    val result = hofFun{no -> no > 0}
    println(result())
}
