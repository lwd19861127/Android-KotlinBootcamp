package ca.ciccc.basics

/// Change the 'sum' function so that it was declared as an extension to List<Int>.
fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun main() {
    val sum = sum(listOf(1, 2, 3))
    println(sum)
    val sum2 = listOf(1, 2, 3).sum()
    println(sum2)
}