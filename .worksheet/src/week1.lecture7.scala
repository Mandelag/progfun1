package week1

/**
 * Tail recursive factorial.
 * Donald Knuth: "Early optimization is the root of all evil"
 * But here is that quote put into its context:
 *   http://www.joshbarczak.com/blog/?p=580
 */
object lecture7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(300); 
  def oldFactorial(x:Int):Int = {
  	if (x <= 1) 1 else x*factorial(x-1)
  };System.out.println("""oldFactorial: (x: Int)Int""");$skip(120); 
  
	def tailFactorial(x:Int, aggregate:Int=1):Int = {
  	if (x <= 1) aggregate else tailFactorial(x-1, x*aggregate)
  };System.out.println("""tailFactorial: (x: Int, aggregate: Int)Int""");$skip(185); 
  
  def factorial(x:Int):Int = {
	  def tailFactorial(x:Int, aggregate: Int = 1):Int = {
	  	if (x <= 1) aggregate else tailFactorial(x-1, x*aggregate)
	  }
	  tailFactorial(x, 1)
  };System.out.println("""factorial: (x: Int)Int""");$skip(31); val res$0 = 
  
  //tests
  oldFactorial(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(19); val res$1 = 
  tailFactorial(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  factorial(5);System.out.println("""res2: Int = """ + $show(res$2))}
}
