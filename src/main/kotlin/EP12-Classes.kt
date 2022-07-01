fun main(args: Array<String>) {
    classes()
}

fun classes() {
    val text = """    
             |  //Classes
             |  Classes เปรียบเหมือนกับพิมพ์เขียวของ object
             |  Classes กำหนด methods ที่ทำงานบน object ต้นเเบบ
             |  การประกาศ เเละการใช้ Class
             |  
             |  Ex
             |  การประกาศ Class
             |  class House {
             |     val color: String = "while"
             |     val numberOfWindows: Int = 2
             |     val isForSale: Boolean = false
             |     
             |       fun updateColor(newColor: String) {
             |           ...
             |       }
             |  }
             |  
             |  สร้าง Object ต้นเเบบใหม่
             |  val myHouse = House()
             |  println(myHouse)
             |
             |  //Constructors
             |  การกำหนด constructor บน class header สามารถมีหลายเเบบ
             |  - ไม่มี parameters
             |      class A
             |  - Parameters
             |      ไม่ได้ถูกกำหนดด้วย var หรือ val -> ตัว Copy จะอยู้เเค่ในขอบเขตของ constructor เท่านั้น
             |      class B(x: Int)
             |      ถูกกำหนดด้วย var หรือ val -> ตัว Copy จะอยู่เเค่ในของเขตทุก instances ของ class
             |      class C(val y: Int)
             |       
             |   Ex Constructor
             |     class A 
             |       val aa = A()
             |       
             |     class B(x: Int)
             |       val bb = B(12)
             |       println(bb.x)
             |       Result:  Error compiler error unresolved referece
             |       
             |     class C(val y: Int)
             |       val cc = C(42)
             |       println(cc.y)
             |       Result: 42
             |       
             |    ตัวเเปรเริ่มต้น (Default parameter)
             |       Class instances สามารถกำหนดค่าเริ่มต้น (default values) ได้
             |          - ใช้ default values เพื่อลดจำนวนของ constructors ที่จำเป็น
             |          - Default parameters สามารถใช้ร่วมกับ required parameters
             |          - ทำให้กระชับมากขึ้น (ไม่จำเป็นต้องมี constructor หลาย version)
             |          
             |    Ex
             |    class Box(val length: Int, val width: Int = 20, val height: Int = 40)
             |       val box1 = Box(100, 20, 40)
             |       val box2 = Box(length = 100)
             |       val box3 = Box(length = 100, width = 20, height = 40)
             |       
             |    //Primary constructor
             |       ประกาศ primary constructor ภายใน class header
             |          class Circle(i: Int) {
             |              init {
             |                 ... 
             |              }
             |          }
             |          
             |         มีค่าเทียบเท่ากับ
             |         class Circle {
             |              constructor(i: Int) {
             |                  ...
             |              }
             |         }
             |         
             |    // บล็อกเริ่มต้น (Initializer block)
             |        - โค็ตเริ่มต้นที่จำเป็นใดๆ จะถูกรันใน init block
             |        - สามารถมีหลาย init block ได้
             |        - init blocks จะเป็น body ของ primary constructor
             |          
             |           Ex 
             |           class Square(val side: Int) {
             |              init {
             |                  println(side * 2)
             |              }
             |           }
             |           
             |           val s = Square(10)
             |           Result: 20
             |       
             |    //Constructor หลายตัว
             |       - ใช้คีย์เวิร์ด constructor เพื่อกำหนด secondary constructor
             |       - Secondary constructor ต้องเรียก:
             |          Primary constructor โดยกำหนดคีย์เวิร์ด this  หรือ
             |          Secondary constructor อื่นๆถูกเรียกใช้โดย primary constructor
             |       - ไม่จำเป็นต้องกำหนด body ของ Secondary constructor
             |       
             |          Ex
             |          class Circle(val radius: Double) {
             |              constructor(name: String) : this(1.0)
             |              constructor(diameter: Int) : this(diameter / 2.0) {
             |                  println("in diameter constructor")
             |              }
             |              init {
             |                 println("Area: Math.PI * radius * radius") 
             |              }
             |          }
             |          val c = Circle(3)
             |          
             |     //คุณสมบัติ (Properties)
             |         - กำหนด properties ใน class ด้วยการใช้ val หรือ var 
             |         - สามารถเข้าถึง properties ได้โดยการใช้ชื่อ object เเละตามด้วย "." ตามด้วยชื่อ property
             |         - สามารถกำหนดค่า properties ได้โดยการใช้ชื่อ object เเละตามด้วย "." ตามด้วยชื่อ property(เฉพาะประกาศด้วย var)
             |         
             |          Ex
             |          class Person(var name: String)
             |             fun main() {
             |                  val person = Person("Alex")
             |                  println(person.name) <- เข้าถึงด้วย .<property name>     
             |                  person.name = "Joey" <- ตั้งค่าด้วย .<property name>
             |                  println(person.name)     
             |             }
             |             
             |      //การกำหนด getters เเละ Setters
             |         หากไม่ต้องการใช้ get/set ที่เป็นค่าเริ่มต้น
             |              - Override get() สำหรับ property
             |              - Override set() สำหรับ property (หากประกาศด้วย var)
             |         
             |         Format: var propertyName: DataType = initialValue
             |                     get() = ...
             |                     set(value) {
             |                         ...
             |                     }
             |         
             |          Ex Getter เเบบกำหนดเอง
             |              class Person(val firstName: String, val lastName: String) {
             |                  val fullName: String
             |                      get() = {
             |                          return "firstName lastname" 
             |                      }
             |              }
             |              
             |              val person = Person("John", "Doe")
             |              println(person.fullName)
             |              Result: "John Doe"
             |              
             |          Ex Setter เเบบกำหนดเอง
             |              var fullName: String = ""
             |              get() = "firstName lastName"
             |              set(value) {
             |                  val components = value.split(" ")
             |                  firstName = components[0]
             |                  lastName = components[1]
             |                  field = value 
             |              }
             |          
             |          person.fullName = "Jane Smith"    
             |          
             |        //Function ใน Class
             |            * Class สามารถมี Function
             |            * การประกาศใช้เหมือน function ที่อยู่ในบทที่ 2 "Functions"
             |                 - คีย์เวิร์ด fun
             |                 - สามารถมีค่า default parameter หรือ required parameter ได้
             |                 - กำหนดค่า return type (ถ้าไม่ใช่ Unit)
             |                     
             """.trimMargin()
             println(text)
}



