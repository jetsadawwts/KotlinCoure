fun main(args: Array<String>) {
    nullSafety()
    cannotNullSafety()
    safeCallOperation()
    testNullSafety()
    returnNullPointerException()
    elvisOperation()
    nonNullAssertionOperator()
    safeCall()
    collectionSupportNullable()
}
fun nullSafety() {
    val text = """    
             |ใน Kotlin ตัวเเปรไม่สามารถกำหนดค่าเริ่มต้นเป็น null ได้
             |คุณสามารถกำหนดให้ตัวเเปรเป็น null ได้โดยการใช้ SafeCall
             |การอนุญาติให้ pointer เป็น null ได้ จะใช้ !!
             |คุณจะสามารถทดสอบ null ได้โดยการใช้ตัวดำเนินการ elvis (?:)   
             |                   
             """.trimMargin()
    println(text)
}

fun cannotNullSafety() {
    val text = """    
             |  ใน Kotlin ไม่สามารถกำหนดตัวเเปรพื้นฐานเป็น null ได้
             |ประกาศ Int เเละให้ค่าเป็น null 
             |
             |var numberOfBooks: Int = null     
             |error -> null can not be a value of a non-null type Int   
             |         
             """.trimMargin()
    var numberOfBooks: Int? = null
    println(text)
}

fun safeCallOperation() {
    val text = """    
             |  ประกาศด้วย Int? จะทำให้ตัวเเปรนั้นมีค่าเป็น null ได้
             |          
             |  หลังจากที่ใช้ Safe call operator (?) ค่าสามารถเป็น null ได้
             |var numberOfBook: Int? = null    
             |      
             |*** โดยทั่วไปเซ็ตค่าตัวเเปรเป็น null เพื่อหลีกเลี่ยงปัญหาที่เกิดขึ้นในภายหลัง ***     
             """.trimMargin()
    var numberOfBooks: Int? = null
    println(text)
}

fun testNullSafety() {
    val text = """    
             |  ถ้าตัวเเปร numberOfBooks ไม่มีค่าเป็น null ให้ลดค่าตัวเเปรนั้นลง
             |  
             |var numberOfBooks = 6
             |if(numberOfBooks != null) {
             |   numberOfBooks = numberOfBooks.dec()
             |}
             |*** .doc() -> คำสั่ง -1 *** 
               """.trimMargin()
    var numberOfBooks = 6
    //เเบบเดิม
    if(numberOfBooks != null) {
        numberOfBooks = numberOfBooks.dec()
    }
    //เเบบใช้ safeCall
    numberOfBooks = numberOfBooks.dec()

    println(text)
}

fun returnNullPointerException() {
    val text = """    
             |  ถ้าหากคุณมั่นใจว่าต้องการให้ตัวเเปรไม่เป็น null, สามารถใช้!! เพื่อบังคับให้เป็น ตัวเเปร
             |ประเภท non-null ได้ เเบะคุณสามารถเรียกใช้ methods หรือ properties ได้  
             |val len = s!!.length 
             |โยน ค่า NullPointerException เมื่อ s มีค่าเป็น null
             |*** เนื่องจาก!! จะโยนค่า exception ออกมา เราไม่ควรจะใช้เมื่อมีค่าเป็น null ***
               """.trimMargin()
    println(text)
}

fun elvisOperation() {
    val text = """    
             |  เทส null โดยใช้ตัวดำเนินการ ?:
             |numberOfBooks = numberOfBooks?.doc() ?: 0  
             |*** ?: ตัวดำเนินการนี้บางครั้งถูกเรียกว่า "Elvis operator" เพราะมันมีลักษณะเหมือนรอยยิ้มบนทรงผมปอมปาดัวร์ ที่เอลวิส เพรสลีย์ชอบเซต ***
             |
             |  เมื่อคำสั่งที่อยู่ฝั่งซ้ายมือของ ?: ได้ผลลัพธ์ออกมาเป็น null จะทำให้ Elvis Operator ส่งค่าที่อยู่ฝั่งขวามือออกไปให้แทน 
             |นอกจากนี้ยังสามารถใช้ร่วมกับ Keyword อย่าง return หรือ throw ได้อีกด้วย
             |      fun foo(node: Node): String? { 
             |          val parent = node.getParent() ?: return null       
             |          val name = node.getName() ?: throw IllegalArgumentException("name expected")
             |       }       
             |       
               """.trimMargin()
    println(text)
}

fun nonNullAssertionOperator() {
    val text = """    
             |  Non-null Assertion Operator วิธีนี้จะเหมาะกับกรณีที่ต้องการให้คำสั่งให้ผลลัพธ์ออกมาเป็น NPE โดยใช้เครื่องหมาย !! เพื่อทำให้ตัวแปรแบบ Nullable เกิด Exception เมื่อเรียก
             |ใช้งานในระหว่างที่มีค่าเป็น null  
             |*** จะเห็นว่าภาษา Kotlin ไม่ได้บังคับว่าจะต้องไม่มี NPE เกิดขึ้น แต่จะต้องใช้ Non-null Assertion Operator แทน ***
             |
               """.trimMargin()
    println(text)
}

fun safeCall() {
    val text = """    
             |  Safe Cast สำหรับการแปลงประเภทข้อมูลใด ๆ ที่อาจจะทำให้เกิด ClassCastException ขึ้นได้ สามารถเลี่ยงปัญหาดังกล่าวด้วยการทำให้ข้อมูลนั้น ๆ เป็น null แทนได้
             |val aInt: Int? = a as? Int  
             |*** จะเห็นว่าภาษา Kotlin ไม่ได้บังคับว่าจะต้องไม่มี NPE เกิดขึ้น แต่จะต้องใช้ Non-null Assertion Operator แทน ***
             |
             |  จากโค้ดตัวอย่างดังกล่าว ต้องการแปลงตัวแปร a ให้เป็นแบบ Int แทน แต่เพื่อไม่ให้เกิด ClassCastException จึงใช้คำสั่ง as? ทำให้เวลาตัวแปร a
             |ไม่สามารถแปลงเป็น Int ได้ จะได้ผลลัพธ์ออกมาเป็น null แทน
             |
               """.trimMargin()
    println(text)
}

fun collectionSupportNullable() {
    val text = """    
             |  ในกรณีที่ต้องการสร้างข้อมูลเป็น Collection อย่าง List หรือ Array ก็ตาม ในภาษา Kotlin จะมีคำสั่งเพื่อช่วยให้จัดการกับกรณีที่ข้อมูลข้างในเป็น null ได้ด้วย
             |  ยกตัวอย่างเช่นคำสั่ง filterNotNull() ที่จะช่วยแปลงข้อมูลข้างในที่เป็น Nullable ให้กลายเป็น Non-null ได้ 
             |      val nullableLIst: List<Int?> = listOf(1, 2, null, 4)
             |      val intList: List<Int> = nullableList.filterNotNull()
               """.trimMargin()
    println(text)
}