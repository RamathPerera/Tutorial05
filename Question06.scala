object Question06 extends App{
  def fibonacci(n:Int):Int = n match {
    case x if x==0 => 0
    case x if x==1 => 1
    case _ => fibonacci(n-1)+fibonacci(n-2)
  }

  def fibo_Seq(y:Int): Unit={
    if(y>0) {
      fibo_Seq(y-1)
    }
    println(fibonacci(y))
  }

  fibo_Seq(9)
}