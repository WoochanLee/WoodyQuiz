fun main() {
    val clientList = mutableListOf<String>()
    clientList.add("1")
    clientList.add("2")
    clientList.add("3")
    clientList.add("4")

    println("<KOTLIN>")

    clientList.forEach { s ->
        if (s == "2") {
            return
        }
        println(s)
    }

    println("end")
}