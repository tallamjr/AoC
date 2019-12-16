package day01

import scala.io.Source
import scala.collection.mutable.ListBuffer
import scala.math._

object FuelCalculation extends App {

  def fuelRequirementEquation(fuel: Int) : Int = {

      val feulReq = ( fuel / 3 ) - 2
      return feulReq
  }

  val lines: Iterator[String] =

  if (args.length > 0) {
    val filename = args(0)
    Source.fromFile(filename).getLines
  } else {
    val filename = "/day01/input.txt"
    val fileStream = getClass.getResourceAsStream(filename)
    Source.fromInputStream(fileStream).getLines
  }

  // Create empty list of Integers
  var nums = new ListBuffer[Int]()

  // for (line <- Source.fromFile(filename).getLines) {
  for (line <- lines) {
    val linha  = line.toInt
    var fuelRequirement = fuelRequirementEquation(linha)
    nums += fuelRequirement
  }

  // Reduce ListBuffer to actual immutable List
  val numList = nums.toList
  println(numList.sum)

}
