import classes.*

/*
* -> Escrever um programa - OK
* -> recebe os produtos a serem comprados - OK
* -> forma de pagamentos escolhida - OK
* -> de acordo com a forma de pagamento, efetua a compra utilizando o
*   correto meio de pagamento.
* */

fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()) {
        println("Favor informar os produtos a serem comprados")
        return
    }

    val produtosDisponiveis = arrayOf(
        Produto("Tenis", 290.0),
        Produto("Bola", 220.0)
    )

    val produtosSelecionados = produtosDisponiveis.filter {
        argumentos.any { argumento -> it.nome.equals(argumento, ignoreCase = true) }
    }

    if(produtosSelecionados.isEmpty()) {
        println("Os produtos selecionados não estão disponíveis")
        return
    }

    println("Favor informe a forma de pagamento desejada (Boleto, Pix)")
    val formaPagamentoSelecionada = readLine()

    if(formaPagamentoSelecionada.isNullOrEmpty() || formaPagamentoSelecionada.isNullOrBlank()) {
        println("Favor informar uma forma de pagamento valido")
        return
    }

    val formaPagamento : FormaDePagamento = when (formaPagamentoSelecionada) {
        FormaPagamentoEnum.Pix.toString() -> {
            Pix()
        }
        FormaPagamentoEnum.Boleto.toString() -> {
            Boleto()
        }
        else -> {
            FormaDePagamento()
        }
    }

    println("Seus produtos selecionados")
    produtosSelecionados.forEach { println(it.exibirDadosProduto()) }
    formaPagamento.efetuarPagamento()

}