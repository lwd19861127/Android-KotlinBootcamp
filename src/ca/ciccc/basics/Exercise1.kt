package ca.ciccc.basics

fun isValidIdentifier(s: String): Boolean {
    return when (s) {
        "" -> false
        else -> when (s.subSequence(0,1) as String) {
            in "0".."9" -> false
            else -> isContain(s)
        }
    }
}

fun isContain(s:String): Boolean {
    fun isValidCar(ch: Char) = ch == '_' || ch.isLetterOrDigit()
    for (i in s) {
        if (!isValidCar(i)) return false
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}