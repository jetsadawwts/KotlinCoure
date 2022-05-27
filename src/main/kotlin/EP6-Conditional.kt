fun main(args: Array<String>) {
    ifElseStatement()
    ifElseMuTiCaseStatement()
    range()
    whenStatement()
    forLoopStatement()
    forLoopToStepSizeAndRanges()
    whileStatement()
    repeatStatement()
}

fun ifElseStatement() {
   val numberOfCups = 30
   val numberOfPlates = 50
    println("IfElseStatement")
    if(numberOfCups > numberOfPlates) {
        println("Too many cups!\n")
    } else {
        println("Not enough cup!\n")
    }
}

fun ifElseMuTiCaseStatement() {
    val guests = 30
    println("IfElseMutiCaseStatement")
    if(guests == 0) {
        println("No guests\n")
    } else if(guests < 20) {
        println("Small group of preple\n")
    } else {
        println("large group of people\n")
    }
}

fun range() {
    println("Range คือคำสั่งที่กำหนดค่าที่ต้องการ")
    println("ในช่วง Range จะต้องเป็นข้อมูลเเบบที่เปรียบเทียบได้ เช่น 1 ถึง 100")
    println("Range จะต้องถูกกำหนดข้อเขต")
    println("Object ที่อยู้น Range สามารถ เป็นเเบบที่เปลี่ยนเเละไม่เป็น\n")
    val numberOfstudents = 50
    if(numberOfstudents in 1..100) {
        println("$numberOfstudents  \n")
    }
    println("ถ้าอยากให้ Range นับเน้นช่วง ใช้คำสั่ง Step ตามด้วยจำนวนที่ต้องการให้เว้นช่วง ")

}

fun whenStatement() {
    println("When ใช้สำหรับเงื่อนไขที่มากกว่า 2 เงื่อนไขขึ้นไป\n")
    val result = 40
    when(result) {
        0 -> println("No result!\n")
        in 1..39 -> println("Got results!\n")
        else -> println("That's a lot of results!\n")
    }
}

fun forLoopStatement() {
    println("คำสั่งที่ใช้เรียกข้อมูลใน Array หรือ List")
    val pets = arrayOf("dog", "cat", "canary")
    for (element in pets) {
        println(element + " ")
    }
    println("\n")
    println("ถ้าต้องการให้เเสดง index ของ Array ให้ใช้คำสั่ง withIndex")
    for ((index, element) in pets.withIndex()) {
        println("Item at $index is $element")
    }
    println("\n")
}

fun forLoopToStepSizeAndRanges() {
    println("forloop ขนาดการเพิ่มเเละช่วง(step size and ranges)\n")
    for (i in 1..5) println(i)
    println("\n")
    for (i in 5 downTo 1) println(i)
    println("\n")
    for (i in 3..6 step 2) println(i)
    println("\n")
    for (i in 'd'..'g') println(i)
    println("\n")
}

fun whileStatement() {
    var bicycle = 0
    while (bicycle < 50) {
        bicycle ++
    }
    println("$bicycle bicycles in the bicycle rack\n")
    do {
        bicycle --
        println("$bicycle bicycles in the bicycle rack\n")
    } while (bicycle > 50)
}

fun repeatStatement() {
    println("คือคำสั่งที่จะวนข้อมูลตามที่เราต้องการ\n")
    repeat(2) {
        println("Hello!")
    }
}



