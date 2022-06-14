package one.digitalinnovation.digionebank

class Gerente (nome: String,
               cpf: String,
               salario: Double,
               val senha:String,
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel{
    override fun calculoAuxilio() = salario * 0.5
    override fun login(): Boolean = "lana123" == senha

}