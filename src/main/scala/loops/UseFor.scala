package loops

object UseFor {
  def main(args: Array[String]): Unit = {
//    val name = "Fred"
//    val message = s"Hello ${"Mr. " + name}"
//    val pi = 3.1415926
//    println(f"pi is ${pi}%5.3f")
//    println(message)

//    val numbers = Range(1, 11)
//    val numbers = Range(1, 11, 1)
    val numbers = 1 to 10 // also have x until y which is exclusive

    // Scala 3 for loop
//    for n <- numbers
//      do println(n)

// this would be Scala 2 version
    for {
      n <- numbers // generator -- can have multiple
      twiceN = n * 2 // create intermediate variables
      // filtering condition, fail test? abandon this iteration
      // compare with "continue"
      if n % 2 == 0
    } {
      println(n)
      println(s"twice n is ${twiceN}")
      println("did you like that number?")
    }

    println("-----------------")
    for
      a <- 1 to 13
      o <- a to 13
      h = math.sqrt(a*a+o*o)
      if h % 1 == 0
    do println(s"a is ${a}, o is ${o}, h = ${h}")

    println("-----------------")
    val triangles = for { // Scala 2 wants the curlies, 3 does not
      a <- 1 to 13
      o <- a to 13
      h = math.sqrt(a * a + o * o)
      if h % 1 == 0
    } yield (o, a, h)
    println(triangles)
  }
}
