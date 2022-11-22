package ex20221122

fun main() {

    // label : while문에 이름을(라벨) 부여해서
    // break할 때 어떤 while문을 종료시킬건지 정할 수 있다
    // continue도 동일하게 어떤 while문을 동작시킬건지 정할 수 있음

    outer@while (true){
        println("바깥 while문 작동중")
        while (true){
            println("안쪽 while문 작동중")
            // 어떤 조건을 만족할 경우 바깥 while문까지 종료
            // 기존에 Java 2가지 종료조건이 필요
            break@outer // 근접한 while문 한 개만 빠져나가는데
            // 라벨이름을 쓰면 바깥쪽도 종료

        }
    }
}