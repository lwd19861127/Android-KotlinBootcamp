package ca.ciccc.basics

infix fun Int.eq(other: Int) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

infix fun <T> T.eqSol(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

fun getAnswer() = 2

fun main(args: Array<String>) {
    getAnswer() eq 2
    getAnswer() eq 3
}