package loops

object UseWhile {
  def main(args: Array[String]): Unit = {
    var count = 3
//    while (count > 0) {
//      println(s"count is ${count}")
//      count -= 1
//    }

// Scala 3 version uses do and indentation
    while count > 0 do
      println(s"count is ${count}")
      count -= 1
    println("loop completed")
  }
}
