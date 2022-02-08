package many

object UseLists {
  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila")
    println(s"list is ${names}")
    println(s"first name in list is ${names(0)}")

    // List is "shallowly" immutable
    //    names(0) = "Frederick"
    // new head....
    val othernames = names.updated(0, "Frederick")
    println(s"othernames is ${othernames}")
    println(s"list is ${names}")
    // Generally, change lists from the FRONT!!!
    // allows reuse of the tail part

    println(s"head of names is ${names.head}")
    println(s"tail of names is ${names.tail}")
    println(s"tail.tail.tail of names is ${names.tail.tail.tail}")
    println(s"Nil is ${Nil}")

    // "cons" operator
    val moreNames = "Alf" :: names
    // double colon "cons" is RIGHT associative (colon on RHS of method name
    // makes it right-associative
    // but it's a simple function
//    val yetMoreNames = Nil.::("Bill").::("Freddy").::("Alf")
        val yetMoreNames = "Alf" :: "Freddy" :: "Bill" :: Nil

    yetMoreNames match
//      case List(a, b, c) => println(s"List with 3 items ${a}, ${b}, ${c}")
//      case a :: b :: c :: Nil => println(s"List with 3 items ${a}, ${b}, ${c}")
      case h :: t => println(s"List. Head is ${h}, tail is ${t}")
  }

}
