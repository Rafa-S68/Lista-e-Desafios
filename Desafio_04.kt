fun main(){
    
    println("Digite a largura :")
    val largura = readln()!!.toDouble()
    println("Digite o comprimento :")
    val comprimento = readln()!!.toFloat()

    val area = largura * comprimento

    if (area < 10){
        print("A area de $area m² se classifica por TERRENO POPULAR")
    }
    if (area >= 10 && area <= 50){
        print("A area de $area m² se classifica por TERRENO MASTER")
    }
    if (area > 50){
        print("A area de $area m² se classifica por TERRENO VIP")
    }
}
