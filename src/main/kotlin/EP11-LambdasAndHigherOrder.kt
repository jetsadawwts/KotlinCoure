fun main(args: Array<String>) {
    lambdasAndHigherOrderFunctions()
    lambdaStructure()
    higherOrderStructure()
    functionReference()
    lastParameterCallSyntax()
}



fun lambdasAndHigherOrderFunctions() {
    val text = """    
             |  ใน Kotlin Function ถือเป็น firstClass
             |  function ใน kotlin สามารถถูกเก็บค่าในคัวเเปรเเละ data structures
             |  function ยังสามารถถูกส่งต่อในรูปเเบบ argument ไปยัง/กลับมา จาก higher-order functions อื่นๆ
             |  คุณสามารถใช้ higher-order functions ในการสร้างชั่น "built-in ใหม่"                    
             """.trimMargin()
    println(text)
}

fun lambdaStructure() {
    val text = """    
             |  function lambda
             |  Lambda คือ expression ที่เป็น Function เเบบไม่มีชื่อ
             |  
             |  var dirtLevel = 20
             |  val waterFilter = { level: Int  -> level / 2 } อธิบายโค๊ด level: Int = Parameter and type Function Arrow, level / 2 = Code to execute 
             |  println(waterFilter(dirtLevel)) 
             |  result -> 10
             |  
             |  Syntax สำหรับประเภทของ Function
             |  Syntax ใน Kotlin สำหรับประเภทของ Function ค่อนข้างคล้ายกับ Syntax สำหรับ lambda 
             |โดยสามารถประกาศเป็นตัวเเปรที่เก็บค่าของฟังก์ชั่น
             |
             |  val waterFilter: (Int) -> Int = { level -> level / 2 }   
             |           
             |                      เเยก Syntax ได้เเบบนี้
             |  val waterFilter:    (Int) -> Int =          { level -> level / 2 }
             |         |                  |                          |
             |   variable name    Datatype of Variable            Function
             |   
             """.trimMargin()
    println(text)
}

fun higherOrderStructure() {
    val text = """    
             |  Higher-order functions คือ Function ที่รับค่าหรือ return ฟังก์ชั่น
             |  fun encodeMsg(msg: String, encode: (String) -> String): String {
             |      return encode(msg)
             |}
             |
             |  โค็ตข้างบนเรียกฟังก์ชั่นที่ถูกส่งเข้ามาใน arguments ที่ 2 เเละส่ง argument ที่ 1 ให้ Function นั้นไปประมวลผลต่อ
             |  
             |  คุณสามารถเรียกใช้ Function นี้ด้วยการส่ง String เเละ Function เข้าไป
             |  
             |  val enc1: (String) -> String = { input -> input.toUpperCase() }
             |  println(encodeMsg("abc", enc1))                
             """.trimMargin()
    println(text)
}

fun functionReference() {
    val text = """    
             | ใช้ตัวดำเนินการ :: ในการส่ง Function ที่มีชื่อเป็น argument ไปยังอีก function
             |   
             |   fun encodeMsg(msg: String, encode: (String) -> String): String {
             |       return encode(msg)
             |}
             |
             |  fun enc2(input: String): String = input.reversed()
             |  encodeMessage("abc", ::enc2) 
             |  
             |  *** enc2 = ส่ง Function ที่มีต่างจากการส่ง lambda ***       
             |         
             |  ตัวดำเนินการ :: ทำให้ Kotlin รู้ว่าคุณกำลังจะส่ง function reference เป็น argument เเละทำให้ Function นั้นจะไม่ถูกเรียก
             |          
             """.trimMargin()
    println(text)
}

fun lastParameterCallSyntax() {
    val text = """    
             |  ในการเขียน Kotlin เราควรให้ parameter ที่รับ Function เป็น parameter สุดท้ายเวลาเรียก
             |  
             |  fun encodeMsg(msg: String, encode: (String) -> String): String {
             |       return encode(msg)
             |}
             | 
             |  encodeMsg("acronym", { input -> input.toUpperCase() })
             |                    
             |  คุณสามารถส่ง lambda เป็น function parameter โดยไม่จำเป็นต้องใส่ lambda นั้นลงในวงเล็บ
             |                    
             |  encodeMsg("acronym") { input -> input.toUpperCase()  }   
             |                  
             |  หลายๆ function ใน built-in ใน Kotlin ถูกนิยามให้ last parameter call syntax
             |   
             |  inline fun repeat(times: Int, action: (Int) -> Unit) 
             |   repeat(3) {
             |      println("Hello")
             |}                    
             """.trimMargin()
    println(text)
}
