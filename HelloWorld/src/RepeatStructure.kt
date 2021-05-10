fun main(args: Array<String>) {
    // for going up
    for(index in args.indices) { // (0..args.size-1) or (0 until args.size)
        println("Going through arguments indexes: $index and value ${args[index]}")
    }

    // for going down
    for(descendingIndex in args.size-1 downTo 0 /* step 2 */) {
        println("Going through arguments from top to bottom: $descendingIndex and value ${args[descendingIndex]}")
    }

    // foreach or for...of
    for(argument in args) {
        println("Going through arguments with kotlin's foreach: $argument")
    }

    // while
    var readArgumentCounter = 0
    while(readArgumentCounter < args.size) {
        println("Going through arguments with a while loop: ${++readArgumentCounter} and value ${args[readArgumentCounter-1]}")
    }

    // do...while
    var performedLoopCounter = 0
    do {
        println("Going through arguments with a do..while loop: $performedLoopCounter and value ${args[performedLoopCounter]}")
        performedLoopCounter++
    } while (performedLoopCounter < args.size)
}