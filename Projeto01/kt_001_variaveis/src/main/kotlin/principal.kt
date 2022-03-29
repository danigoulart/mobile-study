
fun main() {
    /*
     Java String idade = "10";
     var idade = "10" tb pode ser definido dessa forma mas qual é o tipo da variavel? ele vai
     automaticamente iniciar como string
     */

    var idade: Int
    val peso = 70.30 // Double constante

    idade = 52
    idade += 10

    println(peso)
    println(idade)

    /* tipos customizados, declarando funcionario da classe funcionario
    * acessa facilmente as classes criadas em JAVA */
    val f1: Funcionario = Funcionario() // inicializando a classe
    f1.nome = "João"
    f1.idade = 22;
    f1.id = 58777;
    f1.isEstado_civil = false;


}

/*
* Os dados nas telas são sempre textos, precisa haver uma coversão dos dados para irem do tipo number
para ser levado a tela como texto e o que entra como texto da tela precisa ser convertido pro seu dado
específico
* Modificador val uma vez inicializada vc não pode mais mudar essa variavel = constante
* Não existe tipo primitivo em kotlin, todas as tipagens no kotlin são classes
*
 */
