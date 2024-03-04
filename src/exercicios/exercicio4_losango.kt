package exercicios

fun main(args: Array<String>){
    var Dmaior:Double = 0.0
    var Dmenor:Double = 0.0

    println("Digite o valor da diagonal Maior")
    val D = readLine() ?: "0.0"

    println("Digite o valor da diagonal Menor")
    val d = readLine() ?: "0.0"

    Dmaior = D.toDoubleOrNull() ?: 0.0
    Dmenor = d.toDoubleOrNull() ?: 0.0

    val area = calcularAreaLosango(Dmaior, Dmenor)

    println("A área do losango é: $area")
}
fun calcularAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}
