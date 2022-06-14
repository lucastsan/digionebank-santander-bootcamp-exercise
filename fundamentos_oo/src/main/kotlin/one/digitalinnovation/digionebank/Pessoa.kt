package one.digitalinnovation.digionebank

open class Pessoa (
    open val nome:String,
    open val cpf:String,
){

    fun pessoaInfo() = "Nome: $nome e CPF: $cpf"
}

