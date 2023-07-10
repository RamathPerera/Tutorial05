object Question04 extends App {
  def Check_Number(n: Int): Any = n match {
    case x if x == 0 => "Even Number"
    case x if x == 1 => "Odd Number"
    case _ => Check_Number(n - 2)
  }

  println(Check_Number(7))
  println(Check_Number(4))
}
