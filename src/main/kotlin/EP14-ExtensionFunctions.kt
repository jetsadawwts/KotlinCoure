fun main(args: Array<String>) {
    extensionFunctions()
}

fun extensionFunctions() {
    val text = """    
             |  //ส่วนขยายฟังก์ชั่น (Extension functions)
             |      เพิ่ม function ให้กับ class ที่มีอยู่ที่ไม่สามารถเเก้ไขได้โดยตรง
             |        * เปรียบเหมือนถูกเพิ่มโดย implementer
             |        * ไม่ได้เเก้ class ที่มีอยู่
             |        * ไม่สามารถเข้าถึงตัวเเปรที่เป็น private instance
             |         
             |        Format: 
             |           fun ClassName.functionName( params ) {
             |                body
             |           }
             |           
             |    //ทำไมถึงใช้ Extension functions
             |        * เพิ่ม function การทำงานให้ class ที่ไม่ได้ open
             |        * เพิ่ม function การทำงานให้ class ที่ไมได้เป็นเจ้าของ
             |        * เเยก api หลักออกจาก helper methods สำหรับ classes ที่เป็นเจ้าของ
             |              
             |       *** กำหนด extension functions ในตำเเหน่งที่ค้นพบได้ง่าย เช่น ในไฟล์เดียวกับ class หรือ function ที่ตั้งชื่ออย่างเหมาะสม ***   
             |           
             |         Ex
             |         เพื่ม isOdd() ใน class Int: 
             |         fun Int.isOdd(): Boolean { return this % 2 == 1 }   
             |          
             |         get function isOdd() ให้กับ Int:
             |         3.isOdd()
             |         
             |         Extension functions นั้นทรงพลังมากใน Kotlin    
             """.trimMargin()
    println(text)
}

