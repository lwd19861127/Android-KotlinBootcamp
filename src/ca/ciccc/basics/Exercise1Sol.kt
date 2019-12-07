package ca.ciccc.basics

fun isValidIdentifierSol(s: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch.isLetterOrDigit()
    if (s.isEmpty() || s[0].isDigit())  return false

    for (ch in s)
        if (!isValidCharacter(ch)) return false
    return true
}

