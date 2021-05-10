fun main(args: Array<String>) {
    if(args.isEmpty()) {
        println("Please, enter your product list to see availability")
        return
    }

    val marketList = arrayOf("pão", "queijo", "feijão", "agua", "bolacha", "arroz", "ovo", "frango", "azeite", "oleo")

    val availableRequiredProducts = args.filter { product -> marketList.contains(product.lowercase()) }

    for(requiredProduct in availableRequiredProducts) {
        println("This product is available: $requiredProduct")
    }

    val unavailableRequiredProducts = args.filter { product -> !marketList.contains(product.lowercase()) }

    // exactly the same as a normal foreach loop (training lambda expression)
    unavailableRequiredProducts.forEach { unvailableProduct -> println("This product is not available: $unvailableProduct") }

    val orderedMarketList = marketList.sortedBy { product -> product }
    orderedMarketList.forEach { product -> println("We have this one available too: $product") }

}