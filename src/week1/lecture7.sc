package week1

/**
 * Tail recursive factorial.
 * Donald Knuth: "Early optimization is the root of all evil"
 * But here is that quote put into its context:
 *   http://www.joshbarczak.com/blog/?p=580
 */
object lecture7 {
  def oldFactorial(x:Int):Int = {
  	if (x <= 1) 1 else x*factorial(x-1)
  }                                               //> oldFactorial: (x: Int)Int
  
	def tailFactorial(x:Int, aggregate:Int=1):Int = {
  	if (x <= 1) aggregate else tailFactorial(x-1, x*aggregate)
  }                                               //> tailFactorial: (x: Int, aggregate: Int)Int
  
  def factorial(x:Int):Int = {
	  def tailFactorial(x:Int, aggregate: Int = 1):Int = {
	  	if (x <= 1) aggregate else tailFactorial(x-1, x*aggregate)
	  }
	  tailFactorial(x, 1)
  }                                               //> factorial: (x: Int)Int
  
  //tests
  oldFactorial(5)                                 //> res0: Int = 120
  tailFactorial(5)                                //> res1: Int = 120
  factorial(5)                                    //> res2: Int = 120
}