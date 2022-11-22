package ex20221121

import java.util.*

fun main() {
    // 입력하는 도구를 가져오는 방법
    // Scanner sc = new Scanner(System.in)
    val sc = Scanner(System.`in`)

    // readLine() 사용해서 run창에 입력할 수 있다
    println("readLine()을 사용한 입력 >> ")
    // var num1 = readLine()!!.toInt()의 경우 null 발생X 단정.
    var num1 = readLine()?.toInt()
    // readLine은 무조건 String?타입을 리턴

    // 1. null이 발생할 수 있는 상황에 대해서 조건식 부여
    if (num1 != null) {
        print(num1 + 2)
    }

    // 2. Elvis 연산자
    // print(num1?.plus(2) ?: 실행 코드, 데이터 값)

    // 3.
    // println(num1!! + 2)
    // ? X

}