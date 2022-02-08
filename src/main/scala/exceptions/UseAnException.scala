package exceptions

import java.sql.SQLException
//import scala.util.{Success, Try, Failure}
//import scala.util._ // Scala 2, wildcard import is underscore
import scala.util.* // Scala 3 allows asterisk


object UseAnException {
  def main(args: Array[String]): Unit = {
    // Scala *language* lacks "try with resources"
    // but it's available as a library feature
    try { // Scala 3, leave out the curlies, use indentation :)
      val names = List("Fred", "Jim")
      val idx = (math.random() * 3).toInt
      println(s"third name is ${names(2)}")
    } catch {
      case sqle: SQLException => println("DB broke")
      case ie: IndexOutOfBoundsException => println("Bad subscript")
    } finally {
      println("Always happens")
    }


    // "more functional" is to use Try or use Either... Monad like approaches
    Try {
      if math.random() > 0.5 then
        throw new SQLException()
      else
        "Hello"
    } match {
      case success: Success[String] =>
        println(s"it worked: result is ${success.get}")
//      case failure: Failure[SQLException] =>
//        println(s"it broke ${failure.get}")
    }
  }
}
