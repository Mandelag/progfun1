package week1

/**
 * Tail recursive factorial
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
  oldFactorial(4)                                 //> res0: Int = 24
  tailFactorial(5)                                //> res1: Int = 120
  factorial(5)                                    //> res2: Int = 120
}