package workshop


object Workshop1 extends IWorkshop:

  def main(args: Array[String]): Unit =
    println("WORKSHOP 1")

  def pred(n:Int):Int = if(n>0) n-1 else 0
  def suc(n:Int):Int = n+1

  /**
   * Exercise 1
   */
  def exercise1(x: Int,n:Int): Int = pow(x,n)

  def pow(base: Int, exp: Int): Int = if (exp == 0) 1 else base*pow(base, pred(exp))

  /**
   * Exercise 2
   */
  def exercise2(n: Int): Int = factorial(n)

  def factorial(number: Int): Int = if(number==1 || number==0) 1 else number*factorial(pred(number))

  /**
   * Exercise 3
   */
  def exercise3(n: Int): Int = ???

  /**
   * Exercise 4
   */

  def exercise4(x:Int,y:Int): Int = ???

  /**
   * Exercise 5
   */

  def exercise5(x:Int,y:Int): Int = ???
  /**
   * Exercise 6
   */

  def exercise6(x:Int,y:Int): Int = ???
  

  /**
   * Exercise 7
   */
  
  def exercise7(x:Int,y:Int): Int = ???


  /**
   * Exercise 8
   */

  def exercise8(m:Int,n:Int): Int = ???








    





