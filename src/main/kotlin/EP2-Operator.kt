fun main(args: Array<String>) {
    integerNumbers()
    decimalNumbers()
    numericNumbers()

}

fun integerNumbers() {
    println("ตัวเลขจำนวนเต็ม")
    println(1 + 1)
    println(53 - 3)
    println(50 / 10)
    println(9 % 3)
    //Kotlin.Int
}

fun decimalNumbers() {
    println("ตัวเลขทศนิยม")
    println(1.0 / 2.0)
    println(2.0 * 3.5)
    //Kotlin.Double
}

fun numericNumbers() {
    println("Time -> การคูณ")
    println(2.times(3))
    println("Plus -> การบวก")
    println(3.5.plus(4))
    println("Div -> การหาร")
    println(2.4.div(2))

}

