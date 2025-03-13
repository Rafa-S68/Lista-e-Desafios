/** DESAFIO 01
 */
fun main() {

    print("Quantos cigarros você fuma por dia? ")
    val cigarrosPorDia = readln().toDouble()

    print("Há quantos anos você fuma? ")
    val qtdAnos = readln().toDouble()

    val total = cigarosPorDia * (qtdAnos * 365)
    val minutos = total * 10
    val diasPerdidos = minutos / (24 * 60)

    val diasPerdidosFormat = String.format("%.0f", diasPerdidos)

    println("Você perdeu aproximadamente $diasPerdidos dias de vida devido ao fumo.")
}
