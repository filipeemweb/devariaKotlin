fun main(args: Array<String>) {

    if(args.isEmpty()) {
        println("Please, enter a valid argument")
        return
    }

    val number = args[0].toIntOrNull()

    if (number == null) {
        println("The value entered is not a valid number!")
        return
    }

    println("The number you entered is: $number")

    val sum = number + number
    println("The sum of number + number is: $sum")
}