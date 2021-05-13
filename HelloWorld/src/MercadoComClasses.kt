import classes.Produto

/*
* -> Escrever um programa - OK
* -> recebe alguns produtos como argumentos - OK
* -> validar se esse produtos estão na lista de itens disponíveis do mercado. - OK
* -> Caso estejam, avisar o usuário quais produtos estão disponíveis - OK
* -> quais não estão - OK
* -> exibir a lista de produtos disponíveis ordenados por ordem alfabética- OK
* */

fun main(argumentos: Array<String>) {
    if(argumentos.isEmpty()) {
        println("Favor informar a lista de produtos que deseja comprar!")
        return
    }

    val itensDisponiveis = arrayOf(
        Produto("Arroz", 35.10),
        Produto(preco=16.90, nome="Azeite"),
        Produto("Carne", 59.89),
        Produto(nome="Açucar", preco=2.40)
    )

    val itensSelecionadosDisponiveis = itensDisponiveis.filter {
            produto -> argumentos.any { argumento ->
                argumento.equals(produto.nome, ignoreCase = true)
            }
    }

    for (itemSelecionadoDisponivel in itensSelecionadosDisponiveis) {
        println(itemSelecionadoDisponivel.exibirDadosProduto())
    }

    val itensSelecionadosNaoDisponiveis = argumentos.filter {
            argumento -> !itensDisponiveis.any { produto ->
                produto.nome.equals(argumento, ignoreCase = true)
        }
    }

    itensSelecionadosNaoDisponiveis.forEach { println("Este produto não esta disponivel: $it") }

    itensDisponiveis.sortBy { it.nome } // é igual { e.nome -> e.nome }
    itensDisponiveis.forEach { println("Confira este produto disponivel: ${it.exibirDadosProduto()}") }
}