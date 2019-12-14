package day01

import scala.io.Source
import scala.collection.mutable.ListBuffer
import scala.math._

object FuelCalculation extends App {

  // Create empty list of Integers
  var nums = new ListBuffer[Int]()

  // Get lines from file
  // val filename = getClass.getResource("/input.txt").getFile()
  // println(filename)

  val fileStream = getClass.getResourceAsStream("/day01/input.txt")
  val lines = Source.fromInputStream(fileStream).getLines
  // lines.foreach(line => println(line))

  // for (line <- Source.fromFile(filename).getLines) {
  for (line <- lines) {
    val linha  = line.toInt
    var fuelRequirement = ((linha:Int) / 3) - 2
    nums += fuelRequirement
  }

  // Reduce ListBuffer to actual immutable List
  val numList = nums.toList
  println(numList.sum)

}

// class Input(var filename: String)
