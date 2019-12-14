import scala.io.Source

object Gravity extends App {

  val filename = "input.txt"

  def readCSV(filename: String) : List[Array[Int]] = {
    Source.fromFile(filename)
      .getLines()
      .map(_.split(",").map(_.trim.toInt))
      .toList
  }

  val program = readCSV(filename)
  println(program)
}
