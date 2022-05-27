fun main(args: Array<String>) {
    listOperation()
    lmMutableList()
    mutableList()
    arrayOperation()
    arraySingleTypeAndMuTiTypeOperation()
    combiningArrays()
}

fun listOperation() {
    val text = """    
             |List เป็นกลุ่มของข้อมูลที่เรียงตามลำดับ
             |ข้อมูลใน List สามารถเข้าถึงได้ด้วย Index
             |สามารถมีข้อมูลที่ซ้ำกันได้ใน List
             |*** ประโยคเป็นตัวอย่างนึงของ list: กลุ่มของคำอยู่ใน list, ลำดับเป็นเรื่องสำคัญ เเละคำสามารถซ้ำกันได้ ***
             |
             """.trimMargin()
    println(text)
}

fun lmMutableList() {
    val text = """    
             |  List ที่ไม่สามารถเปลี่ยนค่าได้ (lmmutable list) ใช้ listOf()
             |ประกาศ list โดยใช้ listOf() เเละเเสดงผลออกมา
             |      val instruments = listOf("trumpet", "piano", "violin")
             |      println(instruments)
             |      
             """.trimMargin()
    println(text)
}

fun mutableList() {
    val text = """    
             |  List ที่สามารถเปลี่ยนค่าได้ (Mutable list) ใช้ mutableListOf()
             |Lists สามารถถูกเปลี่ยนได้ถ้าใช้ mutableListOf()
             |      val myList = mutableListOf("trumpet", "piano", "violin")
             |      myList.remove("violin")
             |      result -> Kotlin.Boolean = true  
             |*** ในการประกาศ list ได้ด้วย val โดยคุณไม่สามารถเปลี่ยนตัวเเปรที่อ้างถึงได้ เเต่คุณสามารถ เปลี่ยน content ใน list ได้ ***      
             |
             """.trimMargin()
    println(text)
}

fun arrayOperation() {
    val text = """    
             |  Array เป็นที่ข้อมูลหลายๆตัว
             |  เนื้อหาใน Array สามารถเข้าถึงได้ผ่านทาง Index
             |  ข้อมูลใน Array สามารถเปลี่ยนเเปลงได้
             |  Array ไม่สามารถเปลี่ยนขนาดได้  
             |    
             |  สร้าง Array ของ String ได้ด้วยการใช้ arrayOf()
             |      val pets = arrayOf("dog", "cat", "canary")
             |      println(java.util.Arrays.toString(pets))
             |      result -> [dog, cat, canary]    
             |      
             |  *** ในการประกาศ Array ด้วย val คุณไม่สามารถเปลี่ยนตัวเเปรที่อ้างถึง Array เเต่คุณสามารถเปลี่ยนค่าใน Array ได้ ***    
             
             """.trimMargin()
    println(text)
}

fun arraySingleTypeAndMuTiTypeOperation() {
    val text = """    
             |  Array ที่เก็บข้อมูลหลายประเภท
             |      val mix = arrayOf("hats", 2)
             |      
             |  Array ที่เก็บข้อมูลเพียงประเภทเดียว(ในกรณีเป็นจำนวนเต็ม)
             |      val numbers = intArrayOf(1, 2, 3)
             |      
             """.trimMargin()
    println(text)
}

fun combiningArrays() {
    val text = """    
             |  การต่อ Array ใช้ + ในการต่อ Array
             |      val numbers = intArrayOf(1, 2, 3)
             |      val numbers2 = intArrayOf(4, 5, 6)
             |      val combined = number2 + numbers
             |      println(Array.toSting(combined))
             |      result -> [4, 5, 6, 1, 2, 3]
             |      
             """.trimMargin()
    println(text)
}

