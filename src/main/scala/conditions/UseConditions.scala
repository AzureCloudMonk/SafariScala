package conditions

object UseConditions {
  def main(args: Array[String]): Unit = {
    //    if (math.random() > 0.5) println("it's big")
    //    else println("it's small")

    // Scala 2 if uses parens around the expression
    // does NOT use "then"
//    if (math.random() > 0.5) {
//      println("it's big")
//    } else {
//      println("it's small")
//    }

// if is a conditional expression, use it like a statement
// and it will have a Unit value
    val result = if (math.random() > 0.5) {
      println("it's big")
      "Large"
    } else {
      println("it's small")
      "Small"
    }

    println(s"result is ${result}")

  }
}
