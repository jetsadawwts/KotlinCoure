fun main(args: Array<String>) {
    organizingYourCode()
}

fun organizingYourCode() {
    val text = """    
             |  //Single file, multiple, entities
             |     * kotlin ไม่ได้บังคับให้เขียนหนึ่ง class หรือหนึ่ง interface ต่อไฟล์
             |     * คุณควรจัดกลุ่มโครงสร้างที่เกี่ยวข้องอยู้ในไฟล์เดียวกัน
             |     * ควรคำนึงถึงความยาวเเละความซับซ้อนของไฟล์
             |  
             |  //Package
             |     * เป็นตัวช่วยในการจัดระเบียบ
             |     * ตัวระบุโดยทั่วไปคือคำตัวพิมพ์เล็กที่คั่นด้วยจุด
             |     * ประกาศในบรรทัตเเรกของโค็ดในส่วนที่ไม่เป็น comment ในไฟล์ต่อจากคีย์เวิร์ด package
             |     Format: org.example.game
             |     
             |   //การจำกัดสิทธิ์การมองเห็น(Visibility modifiers)
             |     ใช้ visibility modifiers เพื่อจำกัดข้อมูลที่ต้องการเปิดเผย
             |        * public สามารถเข้าถึงได้จากภายนอก class โดยทุกอย่างเป็น public ตั้งเเต่เริ่มต้นรวมถึงตัวเเปร เเละ methods ของ class
             |        * private สามารถเข้าถึงได้จากภายใน class เท่านั้น (หรือ source file) หากกำลังทำงานกับ Function
             |        * protected จะเหมือนกับ private เเต่ subclasses จะมองเห็นได้
             """
        .trimMargin()
    println(text)
}
