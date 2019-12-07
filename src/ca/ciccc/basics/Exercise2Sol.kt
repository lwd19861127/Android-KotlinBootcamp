package ca.ciccc.basics

fun List<Int>.sumSol1(): Int = this.reduce { acc, i ->  acc + i }

fun List<Int>.sumSol2(): Int {
    var total = 0
    for (e in this) {
        total += e
    }
    return total
}