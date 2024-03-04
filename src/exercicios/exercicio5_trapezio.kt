package exercicios

fun main(args: Array<String>){
    var Bmaior:Double = 0.0
    var Bmenor:Double = 0.0
    var altura:Double = 0.0

    println("Digite o valor da Base Maior")
    val B = readLine() ?: "0.0"

    println("Digite o valor da Base Menor")
    val b = readLine() ?: "0.0"

    println("Digite o valor da Altura")
    val h = readLine() ?: "0.0"

    Bmaior = B.toDoubleOrNull() ?: 0.0
    Bmenor = b.toDoubleOrNull() ?: 0.0
    altura = h.toDoubleOrNull() ?: 0.0

    val area = calcularAreaTrapezio(Bmaior, Bmenor, altura)


    println("A área do trapézio é: $area ")
}
fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return (baseMaior + baseMenor) * altura / 2
}
