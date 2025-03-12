fun main() {
    val numeroSorteado = (1..5).random()

    print("Tente adivinhar o número (entre 1 e 5): ")
    val tentativa = readLine()?.toIntOrNull()

    if (tentativa == null || tentativa !in 1..5) {
        println("Número inválido! Escolha um número entre 1 e 5.")
        return
    }

    if (tentativa == numeroSorteado) {
        println("Parabéns! Você acertou!")
    } else {
        println("Você errou! O número sorteado foi $numeroSorteado.")
    }
}
