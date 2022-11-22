package ex20221118

fun main() {

    // 만약에 어떤 값이 정수일 수도 있고 실수일 수도 있다면 어떻게 해야할까?
    // 스마트 캐스트 : 컴파일러가 자동으로 형변환

    // Number
    var test: Number = 12.34
    println("test의 값은 $test")
    println(test::class.java.simpleName)

    test = 12
    println(test::class.java.simpleName) // 컴파일하면서 자동으로 형변환 : Int

    // Any : Object랑 비슷

}