fun main() {
    val v = IntArray(20) { it }  

    println("Vetor com números:")
  
    for (num in v) {
        println(num)
    }

    v.sort()

    println("\nVetor ordenado em ordem crescente:")
    
    for (num in v) {
        println(num)
    }
}
