fun main() {
    // Chamando o procedimento Fibonacci com o número de termos desejado
    Fibonacci(5)  // Exemplo: Vai mostrar os primeiros 5 termos
    Fibonacci(9)  // Exemplo: Vai mostrar os primeiros 9 termos
}

fun Fibonacci(n: Int) {
    var t1 = 1
    var t2 = 1

    // Verificando se n é 1, pois neste caso, devemos mostrar apenas o primeiro termo
    if (n <= 0) {
        println("Número de termos inválido.")
        return
    }

    // Exibindo os termos
    print("$t1") // O primeiro termo é 1

    // Se for mais de 1 termo, exibe o segundo termo também
    if (n > 1) {
        print(" >> $t2")
    }

    // Agora, a sequência de Fibonacci a partir do terceiro termo
    for (i in 3..n) {
        val nextTerm = t1 + t2
        print(" >> $nextTerm")
        t1 = t2
        t2 = nextTerm
    }

    // Finaliza com " >> FIM"
    println(" >> FIM")
}
