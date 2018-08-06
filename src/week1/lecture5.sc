package week1

object lecture5 {
  val EPSILON = 0.001                             //> EPSILON  : Double = 0.001
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  
  def sqrtIter(guess: Double, value: Double):Double = {
  	if (isGoodEnough(guess, value)) guess else sqrtIter(improve(guess, value), value)
  }                                               //> sqrtIter: (guess: Double, value: Double)Double
  
  def isGoodEnough(guess: Double, value: Double):Boolean = {
  	abs(guess * guess - value) < EPSILON
  }                                               //> isGoodEnough: (guess: Double, value: Double)Boolean
  
  def improve(guess: Double, value: Double):Double = {
    (guess + value/guess) / 2
  }                                               //> improve: (guess: Double, value: Double)Double
  
  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double
  
}