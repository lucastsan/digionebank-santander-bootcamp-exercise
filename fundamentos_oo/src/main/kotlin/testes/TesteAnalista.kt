package testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario


fun main () {
    val bruce = Analista(nome = "Bruce", cpf = "52165969874", salario = 2500.00)

    ImprimeRelatorioFuncionario.imprimir(funcionario = bruce)
}
