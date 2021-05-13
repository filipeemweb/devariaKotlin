import classes.Ave
import classes.Mamifero
import classes.Peixe
import classes.Reptil

/*
* -> Escrever um programa - OK
* -> recebe um nome de animal vertebrado - OK
* -> identifica a qual dos grupos ele pertence (Mamífero, Réptil, Ave e Peixe)
* -> exibir os dados genéricos e exclusivos de cada grupo de animal.
*/

fun main() {
   println("Favor informar qual animal você deseja saber mais:")
   val animalInformado = readLine()

   if(animalInformado.isNullOrBlank() || animalInformado.isNullOrEmpty()) {
      println("Animal informado não é valido!")
      return
   }

   val listaDeAnimaisBancoDados = arrayOf(
      Peixe("Tubarão", qtdNadadeiras = 2),
      Mamifero("Leão", 4),
      Ave("Gavião", 500, consegueFazerMigracao = true),
      Reptil("Serpente", temperaturaCorporal = 8.0)
   )

   val animalSelecionado = listaDeAnimaisBancoDados.find { it.nome.equals(animalInformado, ignoreCase = true) }
   if (animalSelecionado == null) {
      println("Animal selecionado não esta na nosa base, tente novamente")
      return
   }

   when(animalSelecionado) {
      is Mamifero -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Mamífero " +
              "e tem as seguintes caracteristicas: é aquatico: ${animalSelecionado.isMamiferoAquatico}" +
              "pode botar ovo ${animalSelecionado.consegueBotarOvo}")
      is Reptil -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Reptil " +
              "e tem as seguintes caracteristicas: é terrestre: ${animalSelecionado.isReptilTerrestre}" +
              "quantidade de patas ${animalSelecionado.qtdPatas}")
      is Ave -> println("Você persquisou sobre o animal ${animalSelecionado.nome} ele é uma Ave " +
              "e tem as seguintes caracteristicas: sabe voar ${animalSelecionado.consegueVoar}" +
              "consegue fazer migração ${animalSelecionado.consegueFazerMigracao}")
      is Peixe -> println("Você persquisou sobre o animal ${animalSelecionado.nome} ele é um peixe " +
              "e tem as seguintes caracteristicas: é carnivoro ${animalSelecionado.isCarnivoro} " +
              "quantidade de nadadeiras ${animalSelecionado.qtdNadadeiras}")

   }
}