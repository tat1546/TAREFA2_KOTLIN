package exercicios

fun main(args: Array<String>){

    var base:Double = 0.0
    var altura:Double = 0.0
    println("Digite o valor da base")
    val b = readLine() ?: "0.0"


    println("Digite o valor da altura")
    val h = readLine() ?: "0.0"

    base = b.toDoubleOrNull() ?: 0.0
    altura = h.toDoubleOrNull() ?: 0.0

    val area = calcularAreaRetangulo(base, altura)
    println("A área é = $area")

}
fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}
