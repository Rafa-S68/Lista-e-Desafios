fun main() {
    print("Digite o comprimento do primeiro lado: ")
    val lado1 = readLine()?.toDoubleOrNull() ?: return

    print("Digite o comprimento do segundo lado: ")
    val lado2 = readLine()?.toDoubleOrNull() ?: return

    print("Digite o comprimento do terceiro lado: ")
    val lado3 = readLine()?.toDoubleOrNull() ?: return

    if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
        val tipoTriangulo = when {
            lado1 == lado2 && lado2 == lado3 -> "EQUILÁTERO"
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> "ISÓSCELES"
            else -> "ESCALENO"
        }
        println("Os lados informados formam um triângulo $tipoTriangulo.")
    } else {
        println("Os valores informados não podem formar um triângulo.")
    }
}
