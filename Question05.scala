object Question05 extends App{
  def sum_even(n:Int):Int = n match {
    case x if x<=0 => 0
    case x if x%2==0 => x + sum_even(x-2)
    case _ => sum_even(n-1)
  }

  println(sum_even(10))
  println(sum_even(9))
}
