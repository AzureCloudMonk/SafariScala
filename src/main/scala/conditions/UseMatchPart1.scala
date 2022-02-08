package conditions

object UseMatchPart1 {
  def main(args: Array[String]): Unit = {
    val x: Any = "Hello"
    x match { // Scala 2 curlies, indentation for 3
      case 99 => println("it's 99")
      case 100 | 101 | 102 => println("it's 101, 102, or 103")
      // guard condition--no parens needed (even in Scala 2)
      case i:Int if i > 102 => println(s"value is a largeish int, ${i}")
      case i:Int => println(s"value is an int, ${i}") // ORDER SENSITIVE!!!!
      case s: String if s.length > 4 => println(s"It's a longish String ${s}")
      case _ => println("it's something else")
    }
  }
}
