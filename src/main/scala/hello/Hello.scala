package hello

// Scala does NOT have the public keyword
// things are public by default
object Hello {
  // square brackets indicate generic typing NOT array
  // following = in a method is an expression (not "a block")
  // Scala does NOT have "static"
  def main(args: Array[String]): Unit = { // curlies necessary in Scala 2
    println("Hello Scala World!")
    println("part of the main method 'block'")
  } // but curlies NOT necessary to make a block expression in Scala 3

  // part of the object's initializer
  println("Really, what's going on here?")
}

// an App does NOT have access to command line args
object Bonjour extends App {
  println("Bonjour")
}

// Scala 3 syntax!
object GutenTag:
  def main(args: Array[String]): Unit =
    println("Guten Tag!")
