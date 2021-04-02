class TestClass {
    constructor() {
        println("constructor1")
    }
    constructor(str: String): this() {
        println("constructor2 : $str")
    }
    init {
        println("init")
    }
}
fun main() {
    TestClass("Woody")
}