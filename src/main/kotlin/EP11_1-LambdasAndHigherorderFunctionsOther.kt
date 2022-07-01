fun main(args: Array<String>) {
    lambdasAndHigherOrderFunction()
}

fun lambdasAndHigherOrderFunction() {
    val text = """    
             |  Lambdas and Higher-order Functions
             |Function ในภาษา Kotlin สามารถเก็บไว้ในตัวแปร, ส่งเป็น Argument หรือเป็น Return Type ใน Function อื่น ๆ ก็ได้ นั่นก็เพราะว่า Function ใน
             |ภาษา Kotlin ถือว่าเป็น First-class Citizen จึงทำให้ Function ในภาษา Kotlin มีคุณสมบัติในเรื่อง Higher-order Function และ Lambda
             |Expression
             |
             |  การสร้างข้อมูลประเภท Function
             |  การสร้าง Function เพื่อใช้งานกับตัวแปรหรือ Function อื่น ๆ จะอยู่ในรูปแบบเฉพาะที่จะมีการระบุว่า Function นั้น ๆ ว่าจะรับ Parameter อะไรบ้าง
             |และมี Return Type เป็นอะไร เช่น
             |  
             |   val predicate: (Int, String) -> Boolean = ...
             |   
             |จากตัวอย่างโค้ด predicate เป็น Function ที่รับ Parameter 2 ตัว คือ Int กับ String และมี Return Type เป็น Boolean
             |  
             |  ในกรณีที่ Function ดังกล่าวไม่ได้รับ Parameter ใด ๆ ก็ไม่จำเป็นต้องระบุ Parameter Type ใด ๆ ไว้ในนั้น และถ้าไม่มี Return Type ใด ๆ ก็ให้กำหนด 
             |เป็น Unit แทน
             |
             |   val predicate1: () -> Boolean = ...
             |   val predicate2: (String) -> Unit = ...
             |   
             |  และแน่นอนว่าตัวแปรที่เป็น Function ก็สามารถเป็น Nullable ได้เช่นกัน โดยจะต้องใส่เครื่องหมายวงเล็บครอบทั้งหมดแล้วใส่เครื่องหมาย ? ไว้ที่
             |ด้านหลังเหมือนกับ Class ทั่ว ๆ ไป
             | 
             |  val predicate: ((Int, String) -> Boolean)? = ...
             |  
             |  การนำ Function ในรูปแบบดังกล่าวไปใช้งาน จะมีวิธีเรียกสองแบบคือการใช้เครื่องหมายวงเล็บหรือใช้คำสั่ง invoke   
             |   
             |    val predicate1: (Int, String) -> Boolean = ...
             |    val result1: Boolean = predicate1(100, "kotlin")
             |    
             |    val predicate2: () -> Boolean = ...
             |    val result2: Boolean = predicate2()
             |     
             |    val predicate3: (String) -> Unit = ...
             |    predicate3.invoke("kotlin")
             |    
             |    val predicate4: ((Int, String) -> Boolean)? = ...
             |    val result4: Boolean? = predicate4?.invoke(100, "kotlin")
             |    
             |      โดยปกติแล้วจะนิยมใช้เครื่องหมายวงเล็บ แต่ในกรณีที่ Function นั้นเป็นแบบ Nullable จะต้องใช้ invoke เสมอ เพื่อให้ใช้เครื่องหมาย ? 
             |    หรือ Safe Call Operator ได้
             |    
             |    และในการกำหนดค่าให้กับ Function ในรูปแบบดังกล่าว ก็จะต้องใช้ Lambda Expression
             |    
             |    Lambda Expression
             |    Lambda Expression เป็นรูปแบบการสร้าง Function ในรูปของ Expression แทนการประกาศ Function แบบทั่วไป
             |  โดยปกติแล้ว การประกาศ Function ใด ๆ จะมีลักษณะแบบนี้
             |
             | fun compare(a: String, b: String): Boolean { 
             |   return a.length < b.length 
             | }
             | แต่สำหรับ Lambda Expression จะเป็นการสร้าง Expression ขึ้นมาเพื่อใช้กับตัวแปรที่เป็น Function Type หรือใช้เป็น Anonymous Function 
             | 
             |   //Function type variable
             | val compare: (String, String) -> Boolean = { a, b -> a.length < b.length} 
             | 
             |   //Anonymous function
             | fun max(string: String, compare: (String, String) -> Boolean) {  }  
             | max("1234", { a, b -> a.length < b.length })
             | 
             | โดย Lambda Expression จะมี Syntax แบบเต็มดังนี้
             | val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
             | 
             | - โค้ดทั้งหมดของ Lambda Expression จะอยู่ในเครื่องหมายปีกกาเสมอ
             | - Parameter จะขึ้นอยู่กับ Function Type ที่ประกาศไว้ โดยข้างใน Lambda Expression จะกำหนดเป็นชื่อตัวแปรใด ๆ ก็ได้ (ในตัวอย่างกำหนด ชื่อเป็น x และ y)
             | - คำสั่งที่จะทำงานใน Lambda Expression จะอยู่ต่อท้ายเครื่องหมาย > เสมอ
             | - ผลลัพธ์ที่ได้จากคำสั่งในบรรทัดสุดท้าย จะกลายเป็นผลลัพธ์ของ Lambda Expression เสมอ จึงไม่จำเป็นต้องใส่ Keyword ว่า return ไว้ที่บรรทัดสุดท้าย
             | 
             | นอกจากนี้เรายังเขียน Lambda Expression ให้อยู่ในรูปแบบย่อได้อีกด้วย
             | val sum: (Int, Int) -> Int = { x, y -> x + y }
             | val sum = { x: Int, y: Int -> x + y }
             | 
             | กรณีที่ Lambda Expression มี Parameter แค่เพียงตัวเดียว สามารถใช้ it แทนการประกาศชื่อของ Parameter ได้เลย
             | val filter: (String) -> Boolean = { it.length == 5 }
             | 
             |     Higher-order Functions
             |     Higher-order Functions คือ Function ใด ๆ ก็ตามที่รับ Function เป็น Parameter หรือมี Return Type เป็น Function 
             | เพื่อให้เห็นภาพมากขึ้น ลองมาดูตัวอย่างโค้ดที่ใช้ค้นหา String ที่อยู่ใน String Array กัน
             |      fun find(data: Array<String>, predicate: (String) -> Boolean) : String? {
             |          for (element in data) { 
             |              if (predicate(element)) {            
             |                   return element        
             |              }
             |          }
             |         return null
             |       }
             |       
             |   คำสั่งดังกล่าวจะรับ Function เข้ามาเป็น Parameter ที่ชื่อว่า predicate เพื่อนำไปเรียกใช้งานข้างในอีกทีหนึ่ง
             |   val items = arrayOf("Apple", "Banana", "Coconut")
             |   val result1: String? = find(items) { it.contains("A") } // Result: "Apple"
             |   val result1: String? = find(items) { it.length == 6 } // Result: "Banana" 
             |                    
             |   จะเห็นว่าการใช้ Higher-order Function จะช่วยให้โค้ดมีความยืดหยุ่นต่อการนำไปใช้งานมากขึ้น ทำให้โค้ดสามารถนำไป Reuse เพื่อใช้งานได้อย่างมี
             |   ประสิทธิภาพ โดยที่ยังสามารถปรับเปลี่ยนเงื่อนไขการทำงานบางส่วนให้เหมาะสมกับการนำไปใช้งานได้                  
             """.trimMargin()
    println(text)
}