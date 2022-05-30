fun main(args: Array<String>) {
    compactFunction()
}

fun compactFunction() {
    val text = """    
             |  Compact Functions เป็นรูปแบบอย่างหนึ่งในการเขียนโค้ดสำหรับ Function ที่จะช่วยทำให้คำสั่งที่อยู่ใน Function นั้น ๆ อยู่ในรูปแบบที่สั้นกระชับ
             |มากขึ้น เหมาะกับ Function ที่มี Return Type และมีคำสั่งข้างในไม่เยอะเพื่อลดจำนวนโค้ดที่ไม่จำเป็นให้น้อยลง
             |
             |  ยกตัวอย่างเช่น Function ที่รับข้อมูลเข้ามาคำนวณแล้วส่งผลลัพธ์ที่ได้กลับไป
             |  return เป็น DataType
             |  fun calculateArea(width: Int, height: Int): Int {
             |      return width * height
             |}
             |
             |  return เป็น Data Class
             |  fun createSampleUser(): Person {
             |      return Person.Builder() -> คำสั่งที่ใช้ในการใส่ข้อมูลใน Data Class
             |          .name("John") -> Kotlin.String
             |          .age(28) -> Kotlin.Int
             |          .job("Software Engineer") -> Kotlin.String
             |          .create()
             |}         
             |
             |   เมื่อเขียนในรูปแบบของ Compact Function จะไม่ต้องใส่เครื่องหมาย { กับ } และใช้เครื่องหมาย = ต่อท้าย Function ได้เลย
             |   
             |   fun calculateArea(width: Int, height: Int) = width * height
             |   fun createSampleUser(): Person = Person.Builder().name("John").age(28).job("Software Engineer").create()  
             |   
             |   จะเห็นว่า Compact Function จะใส่ Return Type หรือไม่ก็ได้ โดยการใส่ Return Type จะช่วยให้อ่านและเข้าใจได้ง่ายเท่านั้น ไม่มีผลต่อการทำงานใดๆ
             |ของ Compact Function            
             |  
             |  *** การใช้ฟังก์ชั่นกระชับ (compact function) หรือฟังก์ชั่นนิพจน์เดียว (single-expression function) ทำให้ โค็คกระชับเเละอ่านง่านขึ้น ***
             """.trimMargin()
    println(text)
}
