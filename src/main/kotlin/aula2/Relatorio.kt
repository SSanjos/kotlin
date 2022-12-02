package aula2

open class Relatorio {

    open fun gerarRelatorio(objeto: ContaBancaria){
        print(objeto.mostrarDados())
    }

}