package ex20221121

fun main() {

    val a: Int = 128
    val b = a
    println(a === b)
    // === : 참조값(주소값)이 동일한지 비교하는 연산자
    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d)
    println(c === d)
    println(c === e)

}