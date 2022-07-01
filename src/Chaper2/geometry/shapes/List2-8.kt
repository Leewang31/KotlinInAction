package Chaper2.geometry.shapes

import java.util.Random //표준 자바 라이브러리 클래스인 Random 클래스를 임포트 했다

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width

}

fun createRandomRectangle(): Rectangle = Rectangle(Random().nextInt(), Random().nextInt())
