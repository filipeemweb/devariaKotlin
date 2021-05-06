import java.math.BigDecimal

fun performCalculation (firstNumber: BigDecimal, secondNumber: BigDecimal, operator: String): BigDecimal {
    return when(operator) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> firstNumber / secondNumber
        "%" -> firstNumber % secondNumber
        else -> BigDecimal.ZERO
    }
}

fun main() {
    println("Enter a valid number:")
    val firstNumber = readLine()?.toBigDecimalOrNull()

    if (firstNumber == null) {
        println("First number not valid")
        return
    }

    println("Enter another valid number:")
    val secondNumber = readLine()?.toBigDecimalOrNull()

    if (secondNumber == null) {
        println("Second number not valid")
        return
    }

    println("Enter a valid operator (+,-,*,/,%):")
    val operator = readLine()

    if (operator.isNullOrEmpty() || operator.isNullOrBlank() ||
        (operator != null && operator != "+" && operator != "-" &&
                operator != "*" && operator != "/" && operator != "%")) {
        println("Invalid operator")
        return
    }

    val result = performCalculation(firstNumber, secondNumber, operator)
    println("The result of your operation: $result ")
}