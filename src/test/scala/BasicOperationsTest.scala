import org.scalatest.funsuite.AnyFunSuite

class BasicOperationsTest extends AnyFunSuite{
  test("BasicOperations.Add") {
    assert(BasicOperations.Add(5, 6)==11)
    assert(BasicOperations.Add(9.4, 4.5)==13.9)
    assert(BasicOperations.Add('a', 5)=='f')
    assert(BasicOperations.Add('A', 'B')==131)
  }
  test("BasicOperations.AddString"){
    assert(BasicOperations.AddString("Scala", "Practice")=="ScalaPractice")
  }
  test("BasicOperations.Subtract") {
    assert(BasicOperations.Subtract(5, 6) == -1)
    assert(BasicOperations.Subtract(9.4, 4.5) == 4.9)
    assert(BasicOperations.Subtract('A', 75) == -10)
    assert(BasicOperations.Subtract('A', 'B') == -1)
  }
  test("BasicOperations.Multiply") {
    assert(BasicOperations.Multiply(5, 6) == 30)
    assert(BasicOperations.Multiply(1.0, 4.5) == 4.5)
    assert(BasicOperations.Multiply('A', 5) == 325)
    assert(BasicOperations.Multiply('A', 'B') == 4290)
  }
  test("BasicOperations.MultiplyString") {
    assert(BasicOperations.MultiplyString("Scala", 2) == "ScalaScala")
  }
  test("BasicOperations.Divide") {
    assert(BasicOperations.Divide(12, 6) == 2)
    assert(BasicOperations.Divide(9.4, 4.5) == 2.088888888888889)
    assert(BasicOperations.Divide('A', 5) == 13)
    assert(BasicOperations.Divide('A', 'z') == 0.5327868852459017)
    assert(BasicOperations.Divide('A', 0) == "Divide By Zero" )

  }
}