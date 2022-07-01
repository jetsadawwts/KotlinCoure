fun main(args: Array<String>) {
    inheritance()
}

fun inheritance() {
    val text = """    
             |  //การสืบทอด (Inheritance)
             |      * Kotlin มีโครงสร้างการสืบทอดเเบบ เเบบ Single-parent class
             |      * ในเเต่ละ class จะมีเพียงหนึ่ง parent class เท่านั้น เรียกว่า SupperClass
             |      * Subclass เเต่ละอันจะได้รับการสืบทอดสมาชิกทั้งหมดจาก supperClass รวมถึง class ที่ supperClass ได้รับการสืบทอดมาด้วย
             |      *** หากคุณอยากให้ class หลายตัวสิบทอดคุณสมบัติหา class ตัวเดียว, สามารถ interface เนื่องจาากคุณสามารถปรับใช้ Interface ได้มากเท่าทีคุณต้องการ
             |      
             |  //Interface
             |      * เป็นการทำข้อตกลงที่ทุก implementing class จำเป็นต้องทำตาม
             |      * สามารถกำหนด method signatures เเละ property names 
             |      * Interface สามารถสืบทอดมาจาก Interface อื่นๆ ได้
             |      
             |      Format: 
             |      interface NameOfInterface {
             |          interfaceBody    
             |      }
             |      
             |     Ex
             |     interface Shape {
             |          fun computeArea(): Double
             |     }
             |     
             |     class Circle(val radius: Double) : Shape {
             |          override fun computeArea() = Math.PI * radius * radius
             |     }
             |     
             |     val c = Circle(3.0)
             |     println(c.computeArea())
             |     -> 28.274333882308138
             |     
             |   //การขยาย Class (Extending Classes)
             |     * สร้าง class ใหม่จาก class ที่มีอยู่เเล้ว (subclass)
             |     * เพิ่ม function การทำงานให้กับ class โดยไม่ต้องสร้างใหม่ (extension functions)
             |     
             |   //การสร้าง Class ใหม่
             |     * ใน Kotlin Class เรื่มต้นนั้นจะไม่มี subclass (not subclassable)
             |     * ใช้คีย์เวิร์ด open เพิ่ออนุญาติให้มี class ย่อย (Subclassing)
             |     * Properties เเละ Function ถูกกำหนดค่าใหม่ด้วยคีย์เวิร์ด override
             |     
             |     Ex
             |     ประกาศ CLass -> class A
             |     ลองประกาศ Subclass A -> class B: A
             |     Result: A is final and cannot be inherited from
             |     
             |     ใช้คีย์เวิร์ด open
             |     ใช้คีย์เวิร์ด open เพื่อประกาศ class ที่สามารถทำให้เป็น Subclass ได้
             |     ประกาศ class -> open class C
             |     Subclass จาก C -> class D : C()
             |     
             |     //การเเทนที่ (Overriding)
             |      * ต้องใช้ open สำหรับ property เเละ method ที่สามารถถูกเเทนที่ได้ (หากไม่ใช้จะเกิด compiler error)
             |      * ต้องใช้ override เมื่อต้องการเเทนที่ properties เเละ methods 
             |      * บางอย่างที่เป็น override สามารถถูกเเทนที่ได้ใน subclass (ยกเว้นจะเป็น final)
             |      
             |     //Abstract classes
             |      * กำหนด abstract หน้า class เพื่อให้เป็น abstract
             |      * ไม่สามารถสร้างขึ้นได้โดยตรงจำเป็นต้องเป็น subclass 
             |      * คล้ายกับ interface ที่เพิ่มความสามารถในการจัดเก็บสถานะ (state)
             |      * Properties เเละ Functions ที่เป็น abstract จำเป็นต้องถูกเเทนที่ (override)
             |      * สามารถรวม Properties เเละ Functions ที่เป็น non-abstract ได้
             |      
             |        Ex
             |        abstract class Food {
             |              abstract val kcal: Int
             |              abstract val name: String
             |              fun consume() = println("I'm eating {name}")
             |        }
             |        
             |        class Pizza() : Food() {
             |              override val kcal = 600
             |              override val name = "Pizza"
             |        }
             |        
             |        fun main() {
             |             Pizza().consume() 
             |        }
             |        
             |        Result -> I'm eating Pizza
             |        
             |      //ควรใช้สื่งไหนเมือ่ไร
             |         * หากไม่ต้องการกำหนด Behavior หรือ type ที่หลากหลายให้ลองใช้ Interface
             |         * หาก Behavior มีความเฉพาะเจาะจงสำหรับ Type นั้นๆ ให้ลองใช้ Class
             |         * หากต้องการสืบทอด(Inherit) จากหลาย Classes ให้ลองปรับโครงสร้างโค็ด (Refactor) เพื่อดูว่าสามารถเเยก Behavior บางอย่างใน Interface ได้หรือไม่
             |         * หากต้องการปล่อยให้ Properties / Method abstract บางอย่างถูกกำหนดโดย Subclasses ให้ลองใช้ Abstract class
             |         * คุณสามารถขยายได้เพียง Class เดียวเเต่ Implement ได้มากกว่า 1 Interface
             |      
             """.trimMargin()
    println(text)
}