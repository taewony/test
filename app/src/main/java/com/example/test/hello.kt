package com.example.test
fun add(a: Int, b: Int= 2020) = a + b

val sub = { a: Int, b: Int -> a-b}
fun main() {
    val result = sub(10, 20)
    println("result = $result")
}