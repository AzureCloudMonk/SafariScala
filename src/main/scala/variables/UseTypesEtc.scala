package variables

object UseTypesEtc {
  def main(args: Array[String]): Unit = {
    //    var x: Int = 99
    val x: Int = 99
    //    x = 10 // not permitted with val
    println("x is " + x)
    println(s"x + 99 is ${x + 99}")

    var count = 3
    count = count + 1
    count += 1
    //    count++ // these don't exist

    //    comparisons, as expected
    println(3 > 7)

    print(3.+(7))
    print(3 + 7) // infix notation (also for our own methods!)

    val he = "He"
    val llo = "llo"
    val hello = "Hello" // Java literal string pooling is a JVM feature!!!
    // == delegates to the equals(Any) i.e. java equals(Object)
    println(s"he + llo == hello? ${(he + llo) == hello}")
    // eq provides identity comparison (like == in Java or is in Python)
    println(s"he + llo eq hello? ${(he + llo) eq hello}")

    // Scala 3 defines "blocks" using indentation
    //    val theValue =
    //      println("Calculating value of x")
    //      val t = 100
    //      println(s"value of t is ${t}")
    //      99
    //    val theValue = {
    //      println("Calculating value of x")
    //      val t = 100
    //      println(s"value of t is ${t}")
    //      99
    //    }

    // def here actually defines a zero argument function
    // which is invoked without parens!!
//    def theValue = {
    lazy val theValue = {
      println("Calculating value of x")
      val t = 100
      println(s"value of t is ${t}")
      99
    }

    //    println(t) // out of scope
    println("about to print the value...")
    if math.random() > 0.5 then
      println(s"value of theValue is ${theValue}")
      println(s"value of theValue is ${theValue}")
      println(s"value of theValue is ${theValue}")

    println("finished with if...")


    // lazy val
  }
}
