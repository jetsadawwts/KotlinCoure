fun main(args: Array<String>) {
    lastParameterCallSyntaxFunction()
}

fun lastParameterCallSyntaxFunction() {
    val text = """    
             |  Last Parameter Call Syntax
             |  ด้วยคุณสมบัติของ Higher-order Functions ในภาษา Kotlin ทำให้ตัวแปรสามารถมีค่าเป็น Function ได้ จึงสามารถกำหนด Function ให้เป็น
             |  Argument สำหรับ Function อื่น ๆ ได้เช่นกัน
             |                 
             |  fun getUser(id: String, onSuccess: (User) -> Unit) {
             |      // ..
             |  }
             |  val id = "1234"
             |  val onGetUserSuccess = { user: User -> println(user.name) }
             |  getUser(id, onGetUserSuccess)         
             |        
             |  และบ่อยครั้งก็จะสร้างเป็น Anonymous Function แทนการสร้างเป็นตัวแปร
             |  getUser("1234", { user: User -> println(user.name) })
             |  
             |  ซึ่งจะเห็นว่าตอนเรียกใช้งาน เครื่องหมายปีกกาของ Function ดังกล่าวจะอยู่ในวงเล็บของคำสั่ง getUser
             |  ภาษา Kotlin จึงเพิ่มความสามารถที่เรียกว่า Last Parameter Call Syntax เพิ่มเข้ามา เพื่อให้ปีกกาของ Function อยู่ข้างนอกวงเล็บแทน
             |  
             |  getUser("1234") { user: User -> println(user.name) }      
             |  แน่นอนว่าการทำงานทั้งหมดยังคงเหมือนเดิมทุกอย่าง แต่การใช้ Last Parameter Call Syntax จะอ่านและทำความเข้าใจได้ง่ายกว่า
             |  
             |  ในการใช้ Last Parameter Call Syntax จะมีเงื่อนไขว่า Argument ที่เป็น Function จะต้องอยู่ลำดับสุดท้ายและมีเพียง Function เดียวเท่านั้น จึงเป็น
             |  ที่มาว่าการเขียนโค้ดด้วยภาษา Kotlin จะนิยมใส่ Function ไว้เป็น Argument ตัวสุดท้าย
             |  
             |  แต่ถ้า Function นั้น ๆ มี Argument เป็น Function มากกว่า 1 ตัวขึ้นไปจะใช้ Last Parameter Call Syntax ไม่ได้ ดังนั้นเพื่อให้โค้ดสามารถอ่านได้ง่าย
             |  แนะนำให้กำหนดค่าแบบ Named Argument
             |  
             |   fun getUser(id: String, onSuccess: (User) -> Unit, onFailure: (String) -> Unit) {   
             |      // ..
             |   }
             |   getUser( id = "1234", onSuccess = { user: User -> 
             |       // Get user successful 
             |   },
             |      onFailure = { reason: String -> 
             |          // Failed to get user 
             |      } 
             |    )
             |    
             """.trimMargin()
            println(text)
}
