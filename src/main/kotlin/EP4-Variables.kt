fun main(args: Array<String>) {
    variableMutableAndImmutable()
}

fun variableMutableAndImmutable() {
    println("Mutable -> สามารถเปลี่ยนค่าได้")
    var count = 1
    count = 2
    println("val size = 1")
    println("count $count")
    println("Immutable -> ไม่สามารถเปลี่ยนค่าได้")
    val size = 1
    println("size = 2 ")
    println("val size = $size")
    println("Val cannot be reassigned")
}
