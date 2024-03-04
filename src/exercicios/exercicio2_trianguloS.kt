package exercicios

import kotlin.math.sqrt

fun main(args: Array<String>){
    var ladoA:Double = 0.0
    var ladoB:Double = 0.0
    var ladoC:Double = 0.0

    println("Digite o valor do 1º lado")
    val A = readLine() ?: "0.0"
    println("Digite o valor do 2º lado")
    val B = readLine() ?: "0.0"
    println("Digite o valor da base")
    val C = readLine() ?: "0.0"

    ladoA= A.toDoubleOrNull() ?: 0.0
    ladoB= B.toDoubleOrNull() ?: 0.0
    ladoC= C.toDoubleOrNull() ?: 0.0

    if(ladoA==ladoB && ladoB==ladoC){
        val areaE = calcularAreaTrianguloEquilatero(ladoA)
        println("A área do triângulo equilatero é = $areaE")
    }

    else if (ladoA == ladoB || ladoB==ladoC || ladoA==ladoC){
        val areaI = calcularAreaTrianguloIsosceles(ladoA, ladoB, ladoC)
        println("A área do triângulo isósceles é = $areaI")

    }else if (ladoA != ladoB && ladoB!=ladoC && ladoC !=ladoA){
        val areaEs = calcularAreaTrianguloEscaleno(ladoA, ladoB, ladoC)
        println("A área do triângulo Escaleno é = $areaEs")
    }
}

fun calcularAreaTrianguloEquilatero(ladoA: Double): Double {
    return ladoA * ladoA * sqrt(3.0) / 4
}

fun calcularAreaTrianguloIsosceles(ladoA: Double, ladoB: Double, ladoC: Double): Double {
    val base = when {
        ladoA == ladoB -> ladoC
        ladoB == ladoC -> ladoA
        else -> ladoB
    }
    return (base * ladoA) / 2
}

fun calcularAreaTrianguloEscaleno(ladoA: Double, ladoB: Double, ladoC: Double): Double {
    val p = (ladoA + ladoB + ladoC) / 2
    return sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC))
}