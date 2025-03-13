fun main() {
    print("Digite o primeiro termo da PA: ")
    val Termo1 = readLine()?.toInt() ?: return

    print("Digite a razão da PA: ")
    val r = readLine()?.toInt() ?: return

    var soma = 0

    println("\nOs 10 primeiros termos da PA são:")
    for (i in 0 until 10) {
        val termo = Termo1 + i * r
        print("$termo ")
        soma += termo
    }

    println("\nSoma dos termos da PA: $soma")
}
