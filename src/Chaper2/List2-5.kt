package Chaper2

class Person(
        val name: String,           //읽기 전용 프로퍼티로,
                                    // 코틀린은 (비공개)필드와 필드를 읽는 단순한 (공개)게터를 만든다.
        var isMarried: Boolean      //쓸 수 있는 프로퍼티로,
                                    // 코틀린은 (비공개)필드,(공개)게터, (공개)세터를 만든다.
)
fun main(){
    val person = Person("Sso",false)
    println(person.name)

    println(person.isMarried)
}