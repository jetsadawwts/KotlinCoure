fun main(args: Array<String>) {
    specialClasses()
}

fun specialClasses() {
    val text = """    
             |  //enum Class
             |  Enum Class เป็นรูปเเบบของ Class ที่ใช้กำหนดข้อมูลใดๆ ก็ตามที่มีจำนวนเเละค่าที่เฉพาะเจาะจงโดยใส่ Keyword ว่า enum ไว้ที่ข้างหน้า class
             |  
             |      Ex
             |      enum class Direction {
             |          NORTH,
             |          SOUTH,
             |          WEST,
             |          EAST
             |      }
             |      
             |   ในการกำหนดข้อมูลไว้ใน Enum Class จะต้องคั่นระหว่างข้อมูลแต่ละตัวด้วยเครื่องหมาย , เสมอ
             |   
             |       val north: Direction = Direction.NORTH
             |       val west: Direction = Direction.WEST
             | 
             |   นอกจากนี้ Enum Class สามารถมี Property ได้เช่นกัน จึงเหมาะกับข้อมูลที่มีค่าแบบเจาะจงและไม่มีการเปลี่ยนแปลงของข้อมูล
             |   
             |    enum class Language(var code: String) { 
             |       ENGLISH("en"),
             |       JAPANESE("ja"),
             |       KOREAN("ko"),
             |       RUSSIAN("ru"),
             |       THAI("th")
             |    }
             |    val thaiCode = Language.THAI.code 
             |       
             |    เนื่องจาก Enum Class เป็นข้อมูลที่มีจำนวนแบบเจาะจง ทำให้การใช้งานร่วมกับคำสั่งอย่าง When จะทำให้ Compiler สามารถรู้จำนวนข้อมูลที่มีใน Enum Class นั้น ๆ ได้ทันที   
             |    val language = Language.ENGLISH
             |    val result: String = when(language) {
             |      Language.ENGLISH -> "English"
             |      Language.JAPANESE -> "Japanese"
             |      Language.KOREAN -> "Korean"
             |      Language.THAI -> "Thai"
             |    }
             |    
             |    โดยปกติแล้วการใช้ When ในลักษณะแบบนี้ Compiler จะบังคับให้ใส่เงื่อนไขสำหรับ Else ด้วย แต่เมื่อใช้ Enum Class และกำหนดเงื่อนไขครบทั้งหมดที่มี ทำให้ Compiler
             |    ไม่บังคับใส่ Else เพราะไม่สามารถเกิดขึ้นได้นั่นเอง  
             |    
             |    //Singleton
             |      Singleton เป็นหนึ่งใน Software Design Pattern ที่ต้องการสร้าง Instance ของ Class ขึ้นมาแค่เพียงตัวเดียว และเมื่อมีการเรียกใช้งานจากที่ใดก็ตาม
             |      จะใช้ Instance ตัวดังกล่าวเสมอ จะไม่สร้าง Instance ตัวใหม่ขึ้นมาในภายหลังจนกว่าจะสิ้นสุดการทำงานของโปรแกรม
             |      
             |      การสร้าง Class ใด ๆ ก็ตามให้เป็น Singleton ในภาษา Kotlin จะใช้ Keyword ว่า object แทน class
             |      object UserProvider {
             |           var currentName: String = "Skooldio"    
             |           fun getUser(): User {  
             |              ...
             |           }
             |      }
             |      
             |      โดยการทำงานของ object จะเปรียบเสมือน Class ตัวหนึ่ง ที่ข้างในสามารถมี Variable และ Function ได้
             |           val name: String = UserProvider.currentName
             |           val user: User = UserProvider.getUser()
             |           
             |     //Companion Object
             |        เมื่อต้องการให้ Class ใด ๆ มีคำสั่งหรือข้อมูลที่เรียกใช้งานจากที่ไหนก็ได้ทันที โดยไม่ต้องสร้าง Instance ของ Class นั้นขึ้นมาก่อน ในภาษา Kotlin จะ
             |        ต้องใช้ความสามารถที่เรียกว่า Companion Object
             |        
             |        ยกตัวอย่างเช่น Class ชื่อว่า User ที่ทำหน้าที่เก็บข้อมูลของผู้ใช้
             |           class User {    
             |              ...
             |           }
             |           
             |        โดยปกติการเรียกใช้งาน Class ดังกล่าวจะต้องทำการสร้าง Instance ของ Class นั้น ๆ ขึ้นมาก่อน จึงจะเรียกใช้คำสั่งและเรียกข้อมูลที่อยู่ใน Class นั้นได้
             |            val user = User()
             |            
             |        แต่ในบางครั้งอาจจะต้องการให้มีคำสั่งหรือข้อมูลบางอย่างเก็บไว้ใน Class โดยที่เรียกใช้งานได้ทันทีโดยไม่ต้องสร้าง Instance ของ Class นั้นขึ้นมา จึง
             |        สร้างเป็น Companion Object แทน โดยใช้ Keyword ว่า companion object    
             |        
             |             class User {  
             |                  companion object {
             |                      const val DEFAULT_NAME = "Skooldio"
             |                      fun newUser() = User()  
             |                  }
             |             }
             |             
             |        Variable หรือ Function ใด ๆ ที่อยู่ใน Companion Object ของ Class นั้น ๆ จะถูกเรียกใช้งานได้ทันที
             |              val name = User.DEFAULT_NAME
             |              val user = User.newUser()     
             |            
             """.trimMargin()
    println(text)
}

