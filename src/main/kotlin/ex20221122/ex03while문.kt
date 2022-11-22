package ex20221122

import java.util.Scanner

fun main() {

    // while(조건식){
    // 조건식이 true일 동안, 실행시킬 코드
    // }
    // 단, 조건식은 무조건 결과값으로 true/false를 돌려줘야 함
    // 비교연산자, 논리연산자, Boolean(true)

    // ** 팩토리얼 **
    // 1. 입력하는 도구 // 근데 이거 없어도 입력되는건 뭐지
    val sc = Scanner(System.`in`)
    // 2. 출력문 + 입력하는 부분
    print("숫자를 입력하세요 : ")
    var num = readLine()?.toInt()?:1
    // 3. 곱하기 결과를 누적시키는 변수 (sum과 같은 역할)
    var result: Int = 1
    // 4. 반복되는 코드를 while문으로 감싸기
    while(num>0){
        result *= num--
    }
    // 5. 종료조건

    println("결과값 : $result")

}