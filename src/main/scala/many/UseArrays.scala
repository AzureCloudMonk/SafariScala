package many

object UseArrays {
  def main(args: Array[String]): Unit = {
    val names = Array("Fred", "Jim", "Sheila")
    println(names.apply(0)) // long form
    println(names(0)) // conventional form

    names(0) = "Frederick"
    println(names(0))  // this is not apply!!!
  }
}
