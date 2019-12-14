import scala.io.Source
import scala.collection.mutable.ListBuffer
import scala.math._

object FuelRecursion extends App {

  // Create empty list of Integers
  var totalFuel = new ListBuffer[Int]()
  // Create empty list of Integers
  // var totalAdditionalFuel = new ListBuffer[Int]()

  def requiredFuel(mass: Int): Int = {
    var fuel = ((mass:Int) / 3) - 2
    return fuel
  }

  def additionalFuel(mass: Int): List[Int] = {
    var fuel = ((mass:Int) / 3) - 2
    if (fuel >= 1) {
      println("HERE 1")
      totalFuel += fuel
      println("HERE 2")
      println(s"TOTAL: ${totalFuel.toList.sum}")
      println(s"FUEL: ${fuel}")
      additionalFuel(fuel)
    } else {
      totalFuel += 0
    }
    return totalFuel.toList
  }

  val filename = "input.txt"

  // Create empty list of Integers
  var nums = new ListBuffer[Int]()

  // Get lines from file
  for (line <- Source.fromFile(filename).getLines) {
    val linha  = line.toInt
    // var fuelRequirement = ((linha:Int) / 3) - 2
    var fuelRequirement = requiredFuel(linha)

    nums += fuelRequirement + additionalFuel(fuelRequirement).sum
    totalFuel.clear()
  }
  // Reduce ListBuffer to actual immutable List
  val numList = nums.toList
  println(numList)
  println(numList.sum)
}
