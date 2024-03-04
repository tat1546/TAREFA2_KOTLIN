package funcoes

inline fun<T> executarComLog(nomeFuncao: String, funcao: ( )-> T): T{
    println("Entrando no método $nomeFuncao...")
    try{
        return funcao()
    }finally{
        println("Método $nomeFuncao finalizando...")
    }
}
fun Somar(a: Int, b:Int) : Int {
    return a+b
}

fun main(args:Array<String>){
    val resultado = executarComLog("Somar") {
        Somar(4,5)
    }
    println(resultado)
}