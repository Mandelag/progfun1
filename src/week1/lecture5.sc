package week1

object lecture5 {
  val EPSILON = 0.001
  println("Welcome to the Scala worksheet")
  
  def abs(x: Double) = if (x < 0) -x else x
  
  def sqrtIter(guess: Double, value: Double):Double = {
  	if (isGoodEnough(guess, value)) guess else sqrtIter(improve(guess, value), value)
  }
  
  /**
   * Exercise
   *
   * Why: Is not very precise for small number, and can lead to non termination for large number.
   * Reason: a) small number require higher precission, which means require smaller epsilon.
   *   b) delta of large number can also be large with the improve() implementation.
   */
  def isGoodEnough(guess: Double, value: Double):Boolean = {
  	abs(guess * guess - value) < EPSILON
  }
  
  def improve(guess: Double, value: Double):Double = {
    (guess + value/guess) / 2
  }
  
  def sqrt(x: Double) = sqrtIter(1.0, x)
  
  sqrt(4)
  
  sqrt(0.001)
  sqrt(0.1e-20)
  sqrt(1.0e20)
  sqrt(1.0e50)
}