fun main() {
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readLine()?.toIntOrNull() ?: return

    print("Digite a razão da PA: ")
    val razao = readLine()?.toIntOrNull() ?: return

    var soma = 0

    println("\nOs 10 primeiros termos da PA são:")
    for (i in 0 until 10) {
        val termo = primeiroTermo + i * razao
        print("$termo ")
        soma += termo
    }

    println("\nSoma dos termos da PA: $soma")
}
