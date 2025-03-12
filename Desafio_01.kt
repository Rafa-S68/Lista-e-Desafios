/** DESAFIO 01
 */
fun main() {
    print("Quantos cigarros você fuma por dia? ")
    val cigarrosPorDia = readLine()?.toIntOrNull() ?: return

    print("Há quantos anos você fuma? ")
    val anosFumando = readLine()?.toIntOrNull() ?: return

    val minutosPerdidosPorCigarro = 10									
    val diasPorAno = 365
    val minutosPorDia = 1440

    val totalCigarros = cigarrosPorDia * anosFumando * diasPorAno
    val totalMinutosPerdidos = totalCigarros * minutosPerdidosPorCigarro
    val diasPerdidos = totalMinutosPerdidos / minutosPorDia

    println("Você perdeu aproximadamente $diasPerdidos dias de vida devido ao fumo.")
}