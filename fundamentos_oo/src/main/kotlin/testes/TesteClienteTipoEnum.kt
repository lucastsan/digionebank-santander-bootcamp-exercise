package testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main () {
    ClienteTipo.values().forEach {i -> println("${i.name} ${i.descricao}")
    }
    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ

    println(pf.descricao)
    println(pj.descricao)
}