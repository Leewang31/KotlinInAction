package Chaper2

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    print("Hello, $name!")
}