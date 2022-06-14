package testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main (){
    val godofredo = Cliente(nome = "Godofredo", cpf = "598749828", clienteTipo = ClienteTipo.PF, senha = "123456")

    println(godofredo)
    TesteAutenticacao().autenticacao(logavel = godofredo)

}