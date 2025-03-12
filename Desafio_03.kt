fun main() {
    val opcoes = listOf("Pedra", "Papel", "Tesoura")

    print("Escolha (Pedra, Papel ou Tesoura): ")
    val escolhaJogador = readLine()?.capitalize()

    if (escolhaJogador !in opcoes) {
        println("Escolha inválida! Tente novamente.")
        return
    }

    val escolhaComputador = opcoes[(0..2).random()]
    println("Computador escolheu: $escolhaComputador")

    when {
        escolhaJogador == escolhaComputador -> println("Empate!")
        (escolhaJogador == "Pedra" && escolhaComputador == "Tesoura") ||
        (escolhaJogador == "Tesoura" && escolhaComputador == "Papel") ||
        (escolhaJogador == "Papel" && escolhaComputador == "Pedra") -> println("Você venceu!")
        else -> println("Você perdeu!")
    }
}


