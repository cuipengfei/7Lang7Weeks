package Day2.FP

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 10/16/12
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
class ScalaFP {
  def testFP {
    val myList = List("str1", "str2", "third string", "fourth string")
    myList.filter(item => item.length() > 4)
  }
}
