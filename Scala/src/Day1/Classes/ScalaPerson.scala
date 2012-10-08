package Day1.Classes

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 10/8/12
 * Time: 8:52 PM
 * To change this template use File | Settings | File Templates.
 */
class Person(firstName: String) {
  println("Outer constructor")

  def this(firstName: String, lastName: String) {
    this(firstName)
    println("Inner constructor")
  }

  def talk() = println("Hi")
}