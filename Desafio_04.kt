fun main() {
    while (true) {
        println("\nEscolha uma opção:")
        println("1 - Jogo de Adivinhação (1 a 5)")
        println("2 - Aprovação de Empréstimo")
        println("3 - Cálculo do IMC")
        println("4 - Aluguel de Carros")
        println("5 - Pontos por Atividade Física")
        println("6 - Reajuste Salarial")
        println("0 - Sair")

        print("Opção: ")
        when (readLine()?.toIntOrNull()) {
            1 -> jogoAdivinhacao()
            2 -> aprovacaoEmprestimo()
            3 -> calculoIMC()
            4 -> aluguelCarros()
            5 -> pontosAtividade()
            6 -> reajusteSalarial()
            0 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida! Tente novamente.")
        }
    }
}

// Jogo de Adivinhação
fun jogoAdivinhacao() {
    val numeroSorteado = (1..5).random()
    print("Tente adivinhar o número (entre 1 e 5): ")
    val tentativa = readLine()?.toIntOrNull()

    if (tentativa == numeroSorteado) println("Parabéns! Você acertou.")
    else println("Você errou! O número era $numeroSorteado.")
}

// Aprovação de Empréstimo
fun aprovacaoEmprestimo() {
    print("Valor da casa: R$")
    val valorCasa = readLine()?.toDoubleOrNull() ?: return

    print("Salário do comprador: R$")
    val salario = readLine()?.toDoubleOrNull() ?: return

    print("Anos de financiamento: ")
    val anos = readLine()?.toIntOrNull() ?: return

    val prestacaoMensal = valorCasa / (anos * 12)
    val limite = salario * 0.3

    println("Prestação: R$%.2f".format(prestacaoMensal))
    if (prestacaoMensal > limite) println("Empréstimo NEGADO!")
    else println("Empréstimo APROVADO!")
}

// Cálculo do IMC
fun calculoIMC() {
    print("Peso (kg): ")
    val peso = readLine()?.toDoubleOrNull() ?: return

    print("Altura (m): ")
    val altura = readLine()?.toDoubleOrNull() ?: return

    val imc = peso / (altura * altura)
    val classificacao = when {
        imc < 18.5 -> "Abaixo do peso"
        imc < 25 -> "Peso ideal"
        imc < 30 -> "Sobrepeso"
        imc < 40 -> "Obesidade"
        else -> "Obesidade mórbida"
    }

    println("Seu IMC: %.2f - $classificacao".format(imc))
}

// Aluguel de Carros
fun aluguelCarros() {
    print("Tipo do carro (Popular/Luxo): ")
    val tipoCarro = readLine()?.toLowerCase() ?: return

    print("Dias alugados: ")
    val dias = readLine()?.toIntOrNull() ?: return

    print("Km percorridos: ")
    val km = readLine()?.toDoubleOrNull() ?: return

    val precoDia = if (tipoCarro == "popular") 90 else 150
    val precoKm = when {
        tipoCarro == "popular" && km <= 100 -> 0.20
        tipoCarro == "popular" -> 0.10
        tipoCarro == "luxo" && km <= 200 -> 0.30
        else -> 0.25
    }

    val precoTotal = (dias * precoDia) + (km * precoKm)
    println("Total a pagar: R$%.2f".format(precoTotal))
}

// Pontos por Atividade Física
fun pontosAtividade() {
    print("Horas de atividade no mês: ")
    val horas = readLine()?.toIntOrNull() ?: return

    val pontos = when {
        horas <= 10 -> horas * 2
        horas <= 20 -> horas * 5
        else -> horas * 10
    }

    val dinheiro = pontos * 0.05
    println("Pontos: $pontos | Ganho: R$%.2f".format(dinheiro))
}

// Reajuste Salarial
fun reajusteSalarial() {
    print("Salário atual: R$")
    val salario = readLine()?.toDoubleOrNull() ?: return

    print("Gênero (M/F): ")
    val genero = readLine()?.toUpperCase() ?: return

    print("Anos de empresa: ")
    val anos = readLine()?.toIntOrNull() ?: return

    val aumento = when {
        genero == "F" && anos < 15 -> 0.05
        genero == "F" && anos <= 20 -> 0.12
        genero == "F" -> 0.23
        genero == "M" && anos < 20 -> 0.03
        genero == "M" && anos <= 30 -> 0.13
        genero == "M" -> 0.25
        else -> 0.0
    }

    val novoSalario = salario + (salario * aumento)
    println("Novo salário: R$%.2f".format(novoSalario))
}
