package testes

import one.digitalinnovation.digionebank.Gerente

fun main () {
    val lana = Gerente(nome = "Lana", cpf = "1568498156", salario = 5000.00, senha = "lana123")
    ImprimeRelatorioFuncionario.imprimir(funcionario = lana)

    TesteAutenticacao().autenticacao(logavel = lana)
}