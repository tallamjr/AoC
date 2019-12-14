import scala.io.Source
import scala.collection.mutable.ListBuffer
import scala.math._

object FuelCalculation extends App {

  val filename = "input.txt"
  // Create empty list of Integers
  var nums = new ListBuffer[Int]()

  // Get lines from file
  for (line <- Source.fromFile(filename).getLines) {
    val linha  = line.toInt
    var fuelRequirement = ((linha:Int) / 3) - 2
    nums += fuelRequirement
  }

  // Reduce ListBuffer to actual immutable List
  val numList = nums.toList
  println(numList.sum)

}
