package one.digitalinnovation.digionebank

class Pessoa {
    var name = "Lucas"
    var cpf = "111.111.111-11"
}

fun main () {
    val lucas = Pessoa()

    println(lucas.name)
    println(lucas.cpf)

}