fun main() {
    var a = "Kotlin";
    var b:String? = null
    /*
    Interrogação significa que essa variável aceita valores nulos
     */

    println("Tamanho de a: ${a.length}")
    println("Tamanho de b: ${b?.length}") // !! -> assumindo a responsabilidade
    // para chamar um método ${}

    b?.let{
        println("Tamanho de b: ${it.length}")
    }

}