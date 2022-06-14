package testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main () {
    val bruce = Funcionario(nome = "Bruce", cpf = "52165969874", salario = BigDecimal.valueOf(2500))

    println(bruce.nome)
    println(bruce.cpf)
    println(bruce.salario)
}