fun main() {
    val n = 10
    var t1 = 0
    var t2 = 1

    println("Os primeiros $n elementos da sequência de Fibonacci são:")

    for (i in 1..n) {
        println(t1)
        val nextTerm = t1 + t2
        t1 = t2
        t2 = nextTerm
    }
}
