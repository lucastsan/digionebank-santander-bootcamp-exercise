package one.digitalinnovation.digionebank

class Pessoa {
    var name = "Lucas"
    var cpf = "111.111.111-11"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $name e CPF: $cpf"
}

fun main () {
    val lucas = Pessoa()

    println(lucas.pessoaInfo())

}