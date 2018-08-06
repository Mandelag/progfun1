package week1

object lecture5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(54); 
  val EPSILON = 0.001;System.out.println("""EPSILON  : Double = """ + $show(EPSILON ));$skip(44); 
  println("Welcome to the Scala worksheet");$skip(47); 
  
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(148); 
  
  def sqrtIter(guess: Double, value: Double):Double = {
  	if (isGoodEnough(guess, value)) guess else sqrtIter(improve(guess, value), value)
  };System.out.println("""sqrtIter: (guess: Double, value: Double)Double""");$skip(415); 
  
  /**
   * Exercise
   *
   * Why: Is not very precise for small number, and can lead to non termination for large number.
   * Reason: a) small number require higher precission, which means require smaller epsilon.
   *   b) delta of large number can also be large with the improve() implementation.
   */
  def isGoodEnough(guess: Double, value: Double):Boolean = {
  	abs(guess * guess - value) < EPSILON
  };System.out.println("""isGoodEnough: (guess: Double, value: Double)Boolean""");$skip(92); 
  
  def improve(guess: Double, value: Double):Double = {
    (guess + value/guess) / 2
  };System.out.println("""improve: (guess: Double, value: Double)Double""");$skip(44); 
  
  def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(13); val res$0 = 
  
  sqrt(4);System.out.println("""res0: Double = """ + $show(res$0))}
}
