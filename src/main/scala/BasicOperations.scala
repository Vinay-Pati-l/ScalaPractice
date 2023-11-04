object BasicOperations {

  def Add(x:Double, y:Double): Any = { x + y}
  def AddString(x: String, y: String): String = {
    x + y
  }
  def Subtract(x:Double, y:Double): Any = { x - y}
  def Multiply(x:Double, y:Double): Any = { x * y}
  def MultiplyString(x:String, y:Int): Any = { x * y}

  def Divide(x: Double, y: Double): Any = {
    if (y == 0) {
      "Divide By Zero"
    }
    else {
      x / y
    }
  }


}
