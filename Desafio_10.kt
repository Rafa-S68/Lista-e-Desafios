fun main() {
    o
    Fibonacci(5)  
    Fibonacci(9)  
}

fun Fibonacci(n: Int) {
    var t1 = 1
    var t2 = 1

    if (n <= 0) {
        println("Número de termos inválido.")
        return
    }

   
    print("$t1") 

   
    if (n > 1) {
        print(" >> $t2")
    }

    for (i in 3..n) {
        val nextTerm = t1 + t2
        print(" >> $nextTerm")
        t1 = t2
        t2 = nextTerm
    }

    println(" >> FIM")
}
