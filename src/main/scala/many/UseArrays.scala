package many

import java.time.LocalDate

class UseArrays

object UseArrays {
  def main(args: Array[String]): Unit = {
//    val names = Array.apply("Fred", "Jim", "Sheila")
    val names = Array("Fred", "Jim", "Sheila")
    println(names.apply(0)) // long form
    println(names(0)) // conventional form

    names.update(0, "Frederick")
    names(0) = "Frederick" // this is not apply!!!
    println(names(0))

    println(s"type of names is ${names.getClass}")
    println(s"type of UseArrays is ${UseArrays.getClass}")

    val ua = new UseArrays
    println(s"ua is ${ua}")
    println(s"type of ua is ${ua.getClass}")

    println(s"UseArrays is ${UseArrays}")
    println(s"type of UseArrays is ${UseArrays.getClass}")

    names match
      case Array(a, b, c) => println(s"array with ${a}, ${b}, ${c}")
      case a: Array[String] if a.length > 2 => println("longish array")
      case a: Array[LocalDate] => println("it's an array of LocalDate")
      case a: Array[String] => println("it's an array of String")


  }
}
