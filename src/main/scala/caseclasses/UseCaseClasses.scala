package caseclasses

// case classes get (for free)
// factory
// toString
// equals (based on fields)
// hashCode
// and pattern matching/field extraction in match expressions
case class Car(seats: Int, color:String)
// CAN add methods, fields (which can be mutable)

object UseCaseClasses {
  def main(args: Array[String]): Unit = {
    // invoke the FACTORY (not constructor) to make one
    val ford = Car(5, "Black")
    val otherFord = Car(5, "Black")
    val dodge = Car(7, "Blue")
    println(s"ford is ${ford}")
    println(s"ford == otherFord ${ford == otherFord}")

//    dodge.color = "Blue" // case class tries to be immutable

  ford match
    case Car(seats, "Blue") => println(s"it's a blue ford with ${seats} seats")
    case Car(seats, color) => println(s"${color} with ${seats} seats")
  }
}
