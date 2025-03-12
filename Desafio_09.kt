fun main() {
    val vetor = IntArray(20) { it }  

    println("Vetor com números:")
  
    for (num in vetor) {
        println(num)
    }

    vetor.sort()

    println("\nVetor ordenado em ordem crescente:")
    
    for (num in vetor) {
        println(num)
    }
}
