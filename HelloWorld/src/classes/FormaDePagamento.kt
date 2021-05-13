package classes

open class FormaDePagamento {
    open fun efetuarPagamento() : Unit {
        println("Não foi possivel processar o pagamento com a forma de pagamento selecionada")
    }
}

class Pix : FormaDePagamento() {
    override fun efetuarPagamento() {
        println("Pagamento efetuado via PIX")
    }
}

class Boleto : FormaDePagamento() {
    override fun efetuarPagamento() {
        println("Pagamento efetuado via BOLETO")
    }
}