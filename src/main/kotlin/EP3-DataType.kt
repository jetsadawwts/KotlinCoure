fun main(args: Array<String>) {
    integerType()
    decimalType()
    operandType()
    typeCasting()
    underScores()
    string()
    perString()
    stringTemplate()
    stringTemplateExpression()
}

fun integerType() {
    println("จำนวนเต็ม")
    println("Long")
    println("Int")
    println("Short")
    println("Byte")
    println("\n")
}

fun decimalType() {
    println("จำนวนทศนิยม")
    println("Double")
    println("Float")
    println("Char")
    println("Boolean")
    println("\n")
}

fun operandType() {
    println("Int + Int = Int")
    println("Double + Double = Double")
    println("Int + Double = Double")
    println("\n")
}

fun typeCasting() {
    println("ไม่สามารถใส่ค่าได้ตรงๆ ต้องทำการ casting ก่อน")
    println("โดยการใช้ toInt, toString, toByte อื่นๆ")
    println("Ex")
        val i: Int = 6
        println("ผลลัพธ์" + " " + i.toByte())
    println("\n")
}

fun underScores() {
    println("underscore เพื่อให้ตัวเลขอ่านง่ายขึ้น")
    print("oneMillion" + " " + 1_000_000 + "\n")
    print("idNumber" + " " + 999_99_9999L + "\n")
    print("hexBytes" + " " + 0xFF_EC_DE_5E + "\n")
    println("\n")
}

fun string() {
    println("String คือ ลำดับของอักษรต่อกัน ถูกเปิดเเละปิดด้วยฟันหนู")
    val s1 = "Hello World"
    println("ใน String สามารถใส่ escape characters")
    val s2 = "Hello World\n"
    println("หรือเราสามารถใช้ arbitrary text ด้วย triple quote")
    val s3 = """ var bike = 50 """
    println("\n")
}

fun perString() {
    val numberOfDogs = 2
    val numberOfCat = 3
    println("I have $numberOfDogs dogs and $numberOfCat cats")
    println("\n")
}

fun stringTemplate() {
    println("template expression จะขึ้นต้นด้วย dollar sign $")
    val i = 10
    println("i = $i")
    println("หรือใส่ค่า expression ด้านในปีกกา")
    val s = "abc"
    println("${s.length} is ${s}")
    println("\n")
}

fun stringTemplateExpression() {
    println("การเเสดงค่าของ String")
    val numberOfShirts = 10
    val numberOfPants = 5
    println("I have ${numberOfShirts + numberOfPants} items of clothing")
}