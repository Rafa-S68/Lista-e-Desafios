fun main() {
    val vetor = IntArray(20) { it }  // Preenche o vetor com números de 0 a 19

    println("Vetor com números:")
    // Exibindo os números gerados
    for (num in vetor) {
        println(num)
    }

    // Ordenando o vetor em ordem crescente (neste caso já está em ordem)
    vetor.sort()

    println("\nVetor ordenado em ordem crescente:")
    // Exibindo os números ordenados
    for (num in vetor) {
        println(num)
    }
}
