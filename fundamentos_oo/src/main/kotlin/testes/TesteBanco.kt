package testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne", numero = 13)
    println(digiOneBank.bancoInfo())
}