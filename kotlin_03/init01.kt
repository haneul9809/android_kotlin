class User(name: String, count: Int){
    init {
        println("name : $name, count : $count") //성공
    }
}
    fun someFun() {
        println("name : $name, count : $count") //오류
    }
}
