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

  def factorial(number: Int): Int = if(number==0) 1 else number*factorial(pred(number))

  /**
   * Exercise 3
   */
  def exercise3(n: Int): Int = summation(n)

  def summation(number: Int): Int = if (number==0) number else number+(summation(pred(number)))

  /**
   * Exercise 4
   */
  def exercise4(x:Int,y:Int): Int = sum(x,y)
  
  def sum(number:Int, number2: Int): Int = if (number==0) number2 else suc(sum(pred(number), number2))
  
  /**
   * Exercise 5
   */
  def exercise5(x:Int,y:Int): Int = dif(x,y)

  // lo que hago es ir disminuyendo cada número, cuando el número que está restando
  // da 0, paro y me voy devolviendo con recursividad.
  def dif(number:Int, number2:Int): Int = if (number2==0) number else dif(pred(number), pred(number2))

  /**
   * Exercise 6
   */
  def exercise6(x:Int,y:Int): Int = prod(x, y)
  
  def prod(times:Int, number:Int): Int =
    if(times==0)
      0
    else sum(number, prod(pred(times), number))

  /**
   * Exercise 7
   */
  def exercise7(x:Int,y:Int): Int = ???

  /**
   * Exercise 8
   */
  def exercise8(m:Int,n:Int): Int = mod(m, n)
  
  def mod(number:Int, divisor:Int):Int = if(number<divisor) number else mod(dif(number,divisor),divisor)








    





