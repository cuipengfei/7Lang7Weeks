package Day1.Classes

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 10/7/12
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
class ScalaCompass {
  val directions = List("north", "east", "south", "west")
  var bearing = 0

  //the following two statements will be compiled into the constructor, we can see that in the java and C# file
  print("Initial bearing: ")
  println(direction)

  // END:constructor
  // START:direction
  def direction() = directions(bearing)

  def inform(turnDirection: String) {
    println("Turning " + turnDirection + ". Now bearing " + direction)
  }

  // END:direction

  // START:turns
  def turnRight() {
    bearing = (bearing + 1) % directions.size
    inform("right")
  }

  def turnLeft() {
    bearing = (bearing + (directions.size - 1)) % directions.size
    inform("left")
  }

  // END:turns
}

