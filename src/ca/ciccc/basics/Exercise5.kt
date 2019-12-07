package ca.ciccc.exercises

import kotlin.random.Random

// Unstable val
// Implement the property `foo` so that it produced a different value on each access.
// Note that you can modify the code outside the `foo` getter
// * The main purpose of this task is to illustrate to you that the way to think of
//   a property as something immutable is wrong!
// => 'read-only' property

val foo: Int
    get() {return Random.nextInt()}
    //get() = Random.nextInt()

fun main() {
    // The values should be different
    println(foo)
    println(foo)
    println(foo)
}

