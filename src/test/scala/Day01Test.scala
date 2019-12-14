package day01

import org.scalatest.FunSuite

class HelloTests extends FunSuite {

  val lst = List.empty[String]
  val arr = Array("foo", "bar")

  test("test list methods") {
    assert(lst.size == 0)
  }

  test("test array methods") {
    assert(arr(0) == "foo")
    assertThrows[ArrayIndexOutOfBoundsException] {
      arr(13)
    }
  }
}
