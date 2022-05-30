fun main(args: Array<String>) {
  val temperature = 20
  everythingHasAValues(temperature)
  expressionValues()
  functionStatement()
  returnTypedFunction()
  functionArguments()
}

fun everythingHasAValues(temperature: Int) {
    val text = """    
             |  ใน kotlin เเทบทุกอย่างเป็น expression เเละมีค่า เเม้กระทั่ง if ก็ยังมีค่าดั่งในตัวอย่างนี้
             |
             |val isHot = if(temperature > 40)
             |true else false
             |println(isHot)
             |result -> false
             |
             |*** expression บางอย่างจะไม่สามรถเก็บค่าได้ for loop, while loop, do while loop***
             """.trimMargin()
    println(text)
    val isHot = temperature > 40
//    println(isHot)
}

fun expressionValues() {
    val text = """    
             |บางครั้งค่าของนิพจน์จะเป็น Kotlin.Unit
             |
             |val isUnit = println("this is am expression")
             |println(isUnit)
             |result -> this is am expression
             |
             |  ในตัวอย่างจะเห็นว่า กำหนดค่าเริ่มต้นเป็น String เเต่ผล Result ออกเป็น type Unit 
             |ดังนั้น ไม่ว่าจะกำหนด type เป็นอะไร เเต่ถ้ามาใช้ร่วมกับ println จะเป็น type unit อยู่เสมอ
             |
             |*** Unit = Void ในภาษา Java ***
             """.trimMargin()
    println(text)
}

fun functionStatement() {
    val text = """    
             |  Function About
             |  บล็อกของโค็ดที่ทำหน้าที่กำหนด 
             |  เเบ่งโปรเเกรมใหญ่ๆเป็นก้อนเล็กๆ ที่จัดการได้ง่าย (modular chunks)
             |  ประกาศฟังก์ชั่นด้วยคีย์เวิร์ด fun
             |  สามารถรับ arguments ไม่ว่าจะเป็นเเบบมีชื่อหรือ default
             |  
             """.trimMargin()
    println(text)
}

fun returnTypedFunction() {
    val text = """    
             | ถ้าฟังก์ชั่นไม่ได้ส่งค่า (return) กลับที่มีประโยชน์ ประเภทค่าส่งกลับ จะเป็น Type Unit เสมอ
             |
             | fun printHello(name: String): Unit {
             |     println("Hi there!")
             |}
             | 
             | การประกาศ return type ประเภท Unit นั้นจะทำได้หรือไม่ก็ได้ (optional)
             | 
             | fun printHello(name: String): Unit {
             |     println("Hi there!")
             |}
             | มีค่าเท่ากับ
             | fun printHello(name: String){
             |     println("Hi there!")
             |} 
             """.trimMargin()
    println(text)
}

fun functionArguments() {
    val text = """    
             | function อาจจะมี:
             | - Default parameter (ค่าเริ่มต้น)
             | - Required parameter (บังคับให้ส่งค่า)
             | - Named arguments (ตั้งชื่อชื่อเเปรได้)
             | 
             |  Default parameter (ค่าเริ่มต้น)  
             |  ค่า Default หรือ Default Value จะถูกใช้ในกรณีที่ไม่มีการส่งค่ามา
             |
             |   fun drive(speed: String = "fast") { 
             |   println("drive (speed)")
             |   }
             |   
             |*** ใช้ "=" หลัง type เพื่อกำหนด default values ***   
             | 
             | วิธีเรียกใช้ได้ 3 วิธี
             |  drive() -> drive speed
             |  drive("slow") -> drive slow
             |  drive(speed = "turtle-like") -> drive turtle-like
             |  
             |  Required parameter
             |  ถ้าไม่มีการตั้งค่า default ไว้ ถือว่า parameter นั้นเป็น required parameter ต้องส่งค่ามา
             |    
             | fun tempToday(day: String, temp: Int) {
             |     println("Today is day and it's temp degrees.") 
             |}
             | 
             | ฟังก์ชั่นหนึ่งๆ สามารถมี parameter ทั่งเเบบ default เเละ required
             | fun reformat(str: String, divideByCamelHump: Boolean, wordSeparator: Char, normalizeCase: Boolean = true) {
             |}       
             |
             | ในขนาดที่ต้องส่งค่า required เข้าไป
             |  reformat("Today is a day like no other day, false, '_') 
             |  
             |  Named arguments
             |  เพื่อให้โค็คอ่านง่ายยิ่งขึ้น ใช้ named arguments ตั้งชื่อสำหรับตัวเเปรที่ required
             |  reformat(str, divideByCamelHump = false, wordSeparator = '_') 
             |  
             |    *** การใส่ default argument หลัง positional arguments เป็นสไตล์การเขียนโค็ตที่ดี เพราะผู้ใช้งานจะได้เเค่เฉพาะ required arguments ***
             """.trimMargin()

    println(text)
}
