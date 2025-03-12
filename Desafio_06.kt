fun main() {
    val numeroSorteado = (1..10).random()
    var tentativas = 4

    println("Tente adivinhar o número entre 1 e 10. Você tem $tentativas tentativas!")

    while (tentativas > 0) {
        print("Digite seu palpite: ")
        val tentativa = readLine()?.toIntOrNull()

        if (tentativa == null || tentativa !in 1..10) {
            println("Número inválido! Escolha um número entre 1 e 10.")
            continue
        }

        if (tentativa == numeroSorteado) {
            println("Parabéns! Você acertou! O número era $numeroSorteado.")
            return
        } else {
            tentativas--
            if (tentativas > 0) {
                println("Errado! Você tem mais $tentativas tentativa(s).")
            } else {
                println("Game Over! O número era $numeroSorteado.")
            }
        }
    }
}
