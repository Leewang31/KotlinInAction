package Chaper2

fun main(args: Array<String>) {
    println("Hello, World!")

    println(max(4,3))

    println(max1(4,3))
}

fun max1(a: Int, b: Int): Int = if(a>b) a else b

fun max(a:Int,b:Int):Int{
    return if(a>b) a else b
}
