fun main() {
    val colecao = arrayOf(1, "impacta", true) //permite alterar mas não incluir - fixo
    val colecaoAlternativa = arrayListOf(1, "Batata", true) //permite inclusão e remoção - variavel

    when(colecao[0]) {
        is Int -> {
            println("Inteiro")
        }

        is String -> {
            println("Texto")
        }
        is Boolean -> {
            println("Boleano")
        }
        else -> {
            println("Não tratado")
        }
    }

    var indice = 10

    while (indice < colecaoAlternativa.size) {
        println(colecaoAlternativa[indice])
        indice++
    }
    do{

    } while (indice < colecaoAlternativa.size)
}