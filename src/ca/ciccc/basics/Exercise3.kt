package ca.ciccc.basics

// isEmptyOrNull()
// Add and implement an extension function `isEmptyOrNull()` on the String?.
// It should return true, if the string is null or empty.
fun String?.isEmptyOrNull(): Boolean {
    if (this == null || this.isEmpty()) return true
    return false
}

fun main() {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false

}
