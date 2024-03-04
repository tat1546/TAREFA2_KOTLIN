package exercicios

import kotlin.math.sqrt
fun main(args: Array<String>){
    var raio:Double = 0.0

    println("Digite o valor do raio do circulo")
    val r = readLine() ?: "0.0"

    raio = r.toDoubleOrNull() ?: 0.0

    val area = calcularAreaCircunferencia(raio)

    println("A área da circunferencia é: $area")
}


fun calcularAreaCircunferencia(raio: Double): Double {
    return Math.PI * (raio * raio)
}