package funcoes

inline fun transacao(funcao: () ->Unit) {
    println("abrindo transação...")
    try{
        funcao()
    }finally{
        println("fechando transação")
    }
}

fun main(args: Array<String>){
    transacao{
        println("Executando SQL1...")
        println("Executando SQL2...")
        println("Executando SQL3...")
    }
}