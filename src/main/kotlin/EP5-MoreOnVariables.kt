fun main(args: Array<String>) {
    numberType()
    floatingPoint()
    orderType()
    booleanType()
    charactersType()
    stringType()
    arrayType()
}

fun numberType() {
    println("Byte ตัวแปรขนาด 8 Bit ที่ใช้เก็บค่าตัวเลขระหว่าง -128 ถึง 127\n" +
            "Short ตัวแปรขนาด 16 Bit ที่ใช้เก็บค่าตัวเลขระหว่าง -32,768 ถึง 32,767\n" +
            "Int ตัวแปรขนาด 32 Bit ที่ใช้เก็บค่าตัวเลขระหว่าง -2,147,483,648 (-2³¹) ถึง 2,147,483,647 (2³¹ - 1)\n" +
            "Long ตัวแปรขนาด 64 Bit ที่ใช้เก็บค่าตัวเลขระหว่าง -9,223,372,036,854,775,808 (-2⁶³ ) ถึง 9,223,372,036,854,775,807 (2⁶³)\n")

    println("โดยปกติแล้วการประกาศตัวแปรที่เป็นตัวเลขจำนวนเต็มโดยไม่ระบุประเภทของตัวแปร จะถือว่าเป็น Integer เสมอ แต่ถ้าตัวเลขดังกล่าวมีค่าเกินค่าสูงสุดที่ Integer จะรองรับได้ ตัวแปรนั้นก็จะกลายเป็น Long แทน \n" +
            "val one = 1 // Int\n" +
            " val threeBillion = 3000000000 // Long\n" +
            " val oneByte: Byte = 1\n")

    println("ในกรณีที่ต้องการกำหนดค่าให้เป็นตัวแปร Long แบบเจาะจง สามารถพิมพ์ L ต่อท้ายตัวเลขได้เลย\n" +
            "val oneLong = 1L // Long\n")

}

fun floatingPoint() {
    println("สำหรับตัวเลขแบบมีทศนิยมจะอ้างอิงจากมาตรฐาน IEEE 754 ซึ่งในภาษา Kotlin จะมีตัวแปรประเภทนี้อยู่ 2 แบบ\n" +
            "Float ตัวแปรขนาด 32 Bit มีคุณสมบัติเป็น Single Precision ในมาตรฐาน IEEE 754\n" +
            "Double ตัวแปรขนาด 64 Bit มีคุณสมบัติเป็น Double Precision ในมาตรฐาน IEEE 754\n")

    println("ในการกำหนดค่าตัวเลขที่มีเลขทศนิยมอยู่ด้วยจะทำให้ตัวแปรนั้น ๆ เป็น Double เสมอ\n" +
            " val pi = 3.14 // Double \n" +
            " val one: Double = 1 // Error: type mismatch\n" +
            " val one Double = 1.0 // Double\n" +
            "ในกรณีที่ต้องการกำหนดค่าเป็น Float ให้พิมพ์ f หรือ F ต่อท้ายตัวเลขนั้น ๆ\n" +
            " val three = 3 // Int\n" +
            " val three Float = 3F // Float\n" +
            " val e = 2.7182818284 // Double\n" +
            " val e Float = 2.7182818284f // Float, actual value is 2.7182817\n")
}

fun orderType() {
    println("การกำหนดค่าด้วยตัวเลขในรูปแบบอื่น ๆ\n" +
            "นอกจากนี้เรายังสามารถกำหนดค่าตัวเลขให้กับตัวแปรให้รูปแบบต่าง ๆ เพื่อรองรับการใช้งานที่เฉพาะเจาะจงมากขึ้นได้อีกด้วย\n" +
            "1. กำหนดค่าด้วยเลขฐาน 16 และฐาน 2\n" +
            "ในการกำหนดค่าด้วยตัวเลขฐาน 16 จะต้องพิมพ์ 0x ไว้ข้างหน้าตัวเลข และ 0b สำหรับเลขฐาน 2\n" +
            "val hex = 0x0F\n" +
            "val binary = 0b00001011\n")

    println("2. การใช้เครื่องหมาย _ (ขีดเส้นใต้)\n" +
            "สามารถใส่เครื่องขีดเส้นใต้คั่นระหว่างค่าตัวเลขใด ๆ ก็ได้เพื่อช่วยให้อ่านตัวเลขได้ง่ายขึ้น\n" +
            " val oneMillion = 1_000_000\n" +
            " val creditCardNumber = 1234_5678_9012_3456L\n" +
            " val socialSecurityNumber = 999_99_9999L\n" +
            " val hexBytes = 0xFF_EC_DE_5E\n" +
            " val bytes = 0b11010010_01101001_10010100_10010010\n")

    println("3. ตัวเลขแบบจำนวนเต็มบวก (Unsigned Integer)\n" +
            "ในกรณีที่ต้องการใช้ค่าตัวเลขที่เป็นจำนวนเต็มบวก สามารถใช้ตัวแปรแบบ Unsigned Type ได้\n" +
            "UByte ตัวแปรขนาด 8 Bit ที่ใช้เก็บค่าตัวเลขระหว่าง 0 ถึง 255\n" +
            "UShort ตัวแปรขนาด 16 Bit ที่ใช้เก็บค่าตัวเลขระหว่าง 0 ถึง 65,535\n" +
            "UInt ตัวแปรขนาด 32 Bit ที่ใช้เก็บค่าตัวเลขระหว่าง 0 ถึง 4,294,967,295 (2 ³² - 1)\n" +
            "ULong ตัวแปรขนาด 64 Bit ที่ใช้เก็บค่าตัวเลขระหว่าง 0 ถึง 18,446,744,073,709,551,615 (2 ⁶⁴ - 1)\n")
}

fun booleanType() {
    println("Boolean เป็นรูปแบบข้อมูลที่มีได้แค่ 2 แบบเท่านั้น คือ true หรือ false (ไม่รวม Nullable Boolean ที่สามารถกำหนดค่าเป็น null ได้)\n" +
            "โดย Boolean จะมี Built-in Operation ให้ใช้งานดังนี้\n" +
            "Disjunction (OR) ด้วยเครื่องหมาย ||\n" +
            "Conjunction (AND) ด้วยเครื่องหมาย &&\n" +
            "Negation (NOT) ด้วยเครื่องหมาย !\n" +
            "\n" +
            " val boolTrue: Boolean = true\n" +
            " val boolFalse: Boolean = false\n" +
            " val boolNull: Boolean? = null\n" +
            " val disjunction = boolTrue || boolFalse\n" +
            " val conjunction = boolTrue && boolFalse\n" +
            " val negation = !boolTrue\n")
}

fun charactersType() {
    println("การกำหนดค่าให้กับตัวแปรแบบตัวอักษรจะเรียกว่า Char ที่สามารถกำหนดตัวอักษรได้เพียงแค่ 1 ตัวอักษรเท่านั้น โดยใส่เครื่องหมาย ' ไว้ที่ข้างหน้าและข้างหลังตัวอักษรที่ต้องการ\n" +
            " val aChar: Char = 'a'\n" +
            "และยังสามารถใช้อักขระพิเศษด้วยเครื่องหมาย \\ โดยสามารถใช้ได้กับ \\t, \\b, \\n, \\r, \\', \\, \\\\, \\$ รวมไปถึงตัวอักษรแบบ Unicode เช่น \\uFF00\n" +
            " val aChar = 'a'\n" +
            " println(aChar)\n" +
            " println('\\n')\n" +
            " println('\\uFF00')\n")
}
fun stringType() {
    println("ตัวแปรที่เก็บข้อมูลตัวอักษรเป็นจำนวนหลายตัวหรือเป็นข้อความจะต้องใช้ตัวแปรแบบ String โดยใส่เครื่องหมาย \" ไว้ที่ข้างหน้าและข้างหลังตัวอักษรที่ต้องการ\n" +
            " val str = \"abcd 123\"\n" +
            "ข้อมูลแต่ละตัวที่อยู่ใน String สามารถเข้าถึงได้เหมือนกับ Array ตัวหนึ่ง ทำให้เราสามารถใช้คำสั่ง for เพื่อวนการทำงานตามจำนวนตัวอักษรที่อยู่ใน String ได้\n")
            val str = "abcd 123"
            for (c in str) {
                 println(c)
            }
            println("\n")
    println("String นั้นเป็น Immutable ดังนั้นเมื่อสร้างตัวแปรแบบ String ขึ้นมาจะไม่สามารถเปลี่ยนแปลงค่าในภายหลังได้ และคำสั่งทั้งหมดที่ใช้กับ String จะเป็นการสร้าง String ชุดใหม่ขึ้นมาแทน ทำให้ข้อมูลใน String ตัวเดิมไม่ถูกแก้ไข")
            val str1 = "abcd"
            println(str1.uppercase())
            println(str1)
            println("\n")
    println("และการรวมข้อมูลจากตัวแปรแบบ String เข้าด้วยกันสามารถใช้เครื่องหมาย + ได้เลย โดยเครื่องหมายดังกล่าวจะรวมข้อมูล String ทั้ง 2 ชุดเข้าด้วยกันเพื่อสร้างเป็นข้อมูล String ตัวใหม่")
            val s = "abc" + 1
            println(s + "def")
            println("\n")
    println("นอกจากการใช้เครื่องหมาย + แล้ว ยังสามารถใช้ String Template เพื่อรวมข้อมูลใด ๆ เข้ากับข้อมูล String ได้อีกด้วย โดยใช้เครื่องหมาย $")
            val i = 10
            println("i = $i")
            val s1 = "abc"
            println("s1 has ${s1.length} characters")
            println("\n")

    println("และการขึ้นข้อความบรรทัดใหม่ นอกจากจะใช้ \\\\n แล้ว ยังสามารถกำหนดแบบ Raw String ด้วยเครื่องหมาย \"\"\" ได้เช่นกัน")
            val text = """
             for (c in "foo")        
                 print(c)
             """
            println(text)
            println("\n")

    println("ในกรณีที่ไม่ต้องการเว้นวรรคข้างหน้าข้อความในแต่ละบรรทัด สามารถใช้คำสั่ง trimMargin() เข้ามาช่วยได้")
            val text1 = """    
             |Tell me and I forget.    
             |Teach me and I remember.    
             |Involve me and I learn.    
             |(Benjamin Franklin)             
             """.trimMargin()

    println("โดยคำสั่งดังกล่าวจะตัดเว้นวรรคที่อยู่ข้างหน้า | ออก ซึ่งจะทำให้ได้ผลลัพธ์ออกมาเป็นแบบนี้แทน")
            println(text1)

}

fun arrayType() {
    println("Array เป็นการเก็บข้อมูลหลาย ๆ ตัวให้อยู่ในข้อมูลตัวเดียวกัน โดยข้อมูลใน Array นั้นจะเป็นข้อมูลประเภทเดียวกันหรือต่างกันก็ได้ ขึ้นอยู่กับการกำหนดประเภทของข้อมูลใน Array ตัวนั้น ๆ\n" +
    "\n")
    val texts: Array<String> = arrayOf("A", "B", "C")
    texts.forEach {
        println(it)
    }
    println("\n")
    val anyValues: Array<out Any> = arrayOf("A", 2, 3.0f)
    anyValues.forEach {
        println(it.toString())
    }
    println("\n")
    println("นอกจากนี้ Array ยังมีอีกรูปแบบที่เรียกว่า Primitive Type Array สำหรับข้อมูลอย่าง Byte, Short หรือ String\n" +
            "\n" +
            "BooleanArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ Boolean\n" +
            "ByteArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ Byte\n" +
            "CharArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ Char\n" +
            "DoubleArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ Double\n" +
            "FloatArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ Float\n" +
            "IntArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ Int\n" +
            "LongArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ Long\n" +
            "ShortArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ Short\n" +
            "UByteArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ UByte\n" +
            "UIntArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ UInt\n" +
            "ULongArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ ULong\n" +
            "UShortArray ข้อมูล Array ที่ข้อมูลข้างในเป็นแบบ UShort\n")

    val a: IntArray = intArrayOf(1, 2, 3)
    println("intArrayOf(1, 2, 3)")
    println("result -> [1, 2, 3]")
    println("\n")
    val b = IntArray(3)
    println("IntArray(3))")
    println("result -> [0, 0, 0]")
    println("\n")
    val c = IntArray(5) { 76 }
    println("IntArray(5) { 76 }")
    println("result -> [76, 76, 76, 76, 76]")
    println("\n")
    val d = IntArray(7) { it }
    println("IntArray(7) { it }")
    println("result -> [0, 1, 2, 3, 4, 5, 6]")
    println("\n")
}




