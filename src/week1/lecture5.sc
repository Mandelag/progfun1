package week1

object lecture5 {
  val EPSILON = 0.001                             //> EPSILON  : Double = 0.001
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  
  def sqrtIter(guess: Double, value: Double):Double = {
  	if (isGoodEnough(guess, value)) guess else sqrtIter(improve(guess, value), value)
  }                                               //> sqrtIter: (guess: Double, value: Double)Double
  
  /**
   * Exercise
   *
   * Why: Is not very precise for small number, and can lead to non termination for large number.
   * Reason: a) small number require higher precission, which means require smaller epsilon.
   *   b) delta of large number can also be large with the improve() implementation.
   */
  def isGoodEnough(guess: Double, value: Double):Boolean = {
  	abs(guess * guess - value)/value < EPSILON
  }                                               //> isGoodEnough: (guess: Double, value: Double)Boolean
  
  def improve(guess: Double, value: Double):Double = {
    (guess + value/guess) / 2
  }                                               //> improve: (guess: Double, value: Double)Double
  
  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double
  
  sqrt(4)                                         //> res0: Double = 2.000609756097561
  sqrt(0.001)                                     //> res1: Double = 0.03162278245070105
  sqrt(0.1e-20)                                   //> res2: Double = 3.1633394544890125E-11
  sqrt(1.0e20)                                    //> res3: Double = 1.0000021484861237E10
  sqrt(1.0e50)                                    //> res4: Double = 1.0000003807575104E25
}