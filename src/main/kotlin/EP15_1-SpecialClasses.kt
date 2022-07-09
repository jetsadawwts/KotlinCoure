fun main(args: Array<String>) {
    specialClassesOrder()
}

fun specialClassesOrder() {
    val text = """    
             |  //Data class
             |  * Class พิเศษที่มีอยู่เพื่อจัดเก็บชุดข้อมูล
             |  * ทำเครื่องหมาย class ด้วยคีย์เวิร์ด data
             |  * สร้าง getters สำหรับเเต่ละ property (เเละ setting สำหรับ vars ด้วย)
             |  * สร้าง toString(), equals(), hashCode(), copy() methods เเละ destructuring operators
             |  
             |  Format: data class <NameOfClass> ( parameterList )
             |  
             |  Ex
             |  กำหนด data class
             |  data class Player (val name: String, val score: Int)
             |  
             |  ใช้ data class
             |  val firstPlayer = Player("Lauren", 10)
             |  println(firstPlayer)
             |  Result: Player(name=Lauren, score=10)
             |  Data classes = ช่วยให้โค็ตของคุณกระชับขึ้นมาก
             |  
             |  //Pair เเละ Triple
             |      * Pair เเละ Triple เป็น Data class ที่กำหนดไว้ล่วงหน้า ซึ่งเก็บข้อมูล 2 หรือ 3 ชิ้นตามลำดับ
             |      * เข้าถึงตัวเเปรได้ด้วย .first, .second, .third ตามลำดับ
             |      * โดยปกตื class ที่ตังชื่อด้วย data จะเป็นตัวเลือกที่ดีกว่า (มีความหมายมากกว่าสำหรับ usecase ของคุณ)
             |      
             |      Ex
             |      val bookAuthor = Pair("Harry Potter", "J.K. Rowling")
             |      println(bookAuthor)
             |      result -> (Harry Potter, J.K. Rowling)
             |      
             |      val bookAuthorYear = Triple("Harry Potter", "J.K. Rowling, 1997")
             |      println(bookAuthorYear)
             |      println(bookAuthorYear.third)
             |      result -> (Harry Potter, J.K. Rowling, 1997)
             |      result -> 1997
             |      
             |      
             |  //Pair to
             |      to ตัวเเปรพิเศษของ Pair ช่วยให้คุณสามารถย่อวงเล็บเเละจุด (infix function)
             |      ช่วยให้โค็ดอ่านง่ายขึ้น
             |      
             |      val bookAuth1 = "Harry Potter" .to ("J.K. Rowling")
             |      val bookAuth2 = "Harry Potter" to "J.K. Rowling"
             |      Result -> bookAuth1 and bookAuth2 are pair (Harry Potter, J.K. Rowling)
             |      
             |      ยังใช้ใน collection เช่น Map เเละ Hashmap
             |      val map = mapOf(1 to "x", 2 to "y", 3 to "zz")
             |      Result -> map of Int to String {1=x, 2=y, 3=zz}
             |      
             |  //Enum class
             |      User-defined data สำหรับชุดของค่าที่มีชื่อ
             |          * ใช้ this เพื่อกำหนดให้ Instance เป็นหนึ่งในค่าคงที่หลายค่า
             |          * โดยค่าเริ่มต้น ค่าคงที่จะไม่ปรากฎให้คุณเห็น
             |          * ใช้ enum ก่อนคีย์เวิร์ด class
             |           
             |      Format: enum class EnumName { Name1, Name2, ..., Name n  } 
             |      อ้างอิงผ่าน EnumName.<ConstantName> 
             |      
             |      Ex
             |      กำหนด enum ด้วยสีเเดง สีเขียว สีน้ำเงิน
             |      enum class Color(r: Int, g: Int, b: Int) {
             |          RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255)
             |      }
             |      
             |      println("" + Color.RED.r + " " + Color.RED.g + " " + Color.RED.b)
             |      Result -> 255 0 0
             |      
             |      
             |  //Object/Singleton
             |      * บางครั้งคุณต้องการเพียง instance เดียวของ Class ที่มีอยู่
             |      * ใช้คีย์เวิร์ดของ object เเทน Class 
             |      * เข้าถึงได้ด้วย NameOfObject.<Function or variable>
             |      
             |      Ex
             |      object Calculator {
             |          fun add(n1: Int, n2: Int): Int {
             |              return n1 + n2
             |          }
             |      }
             |      println(Calculator.add(2, 4))
             |      Result -> 6
             |   
             |  //Companion object
             |      * ให้ Instances ทั้งหมดของ Class ใช้ Instance เดียวของชุด variables
             |      * ใช้คีย์เวิร์ด companion
             |      * อ้างอิงผ่าน ClassName.PropertyOrFunction
             |      
             |      Ex
             |      class PhysicsSystem {
             |          companion object WorldConstants {
             |              val gravity = 9.8
             |              val unit = "metric"
             |              fun computeForce(mass: Double, accel: Double): Double {
             |                  return mass * accel
             |              }
             |          }
             |      }    
             |      println(PhysicsSystem.WorldConstants.gravity)           
             |      println(PhysicsSystem.WorldConstants.computeForce(10.0, 10.0))           
             |      
             """
        .trimMargin()
    println(text)
}