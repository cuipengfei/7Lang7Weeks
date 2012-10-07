package Day1

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 10/7/12
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 */
class Day1Code {
  def whileLoop {
    var i = 0
    while (i < 5) {
      println(i)
      i += 1
    }
  }

  def forLoop {
    println("this is a for loop")
    for (i <- 1 until 10) {
      println(i)
    }
  }

  def foreachLoop {
    println("this is a foreach")
    var args = Array("hi", "hey")
    args.foreach {
      arg => println(arg)
    }
  }
}
