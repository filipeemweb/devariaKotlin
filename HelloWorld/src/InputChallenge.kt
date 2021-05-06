fun main() {
    println("Please enter the guest's name:")
    val name = readLine()

    if (name.isNullOrEmpty() || name.isNullOrBlank()) {
        println("Name entered not valid")
        return
    }

    println("Please enter the guest's age:")
    val age = readLine()?.toIntOrNull()

    if (age == null || age <= 0) {
        println("Age entered not valid")
        return
    }

    val isInvited = when(name) {
        "Caique" -> true
        "Ale" -> true
        "Ricardo" -> true
        "Alan" -> true
        "Aldo" -> true
        else -> false
    }

    if (isInvited && age >= 18) {
        println("Welcome to the 2021 Kotlin party!!")
    } else if (!isInvited) {
        println("You're not in the guest list!")
    } else {
        println("Only 18+ allowed")
    }
}