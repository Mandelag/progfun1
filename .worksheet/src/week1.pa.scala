package week1

object pa {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 
  
  /**
   * Assignment 2
   */
  def balance(chars: List[Char]): Boolean = {
    true
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(53); val res$0 = 
  
  balance("This (is a) balanced strings!".toList);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(247); 
  
  /**
   * Assignment 1
   */
  def pascal(column: Int, row: Int): Int = {
  	def pascalOrdinary(c: Int, r: Int): Int = {
    	if (c == 0 || c == r) 1 else pascalOrdinary(c-1,r-1) + pascalOrdinary(c,r-1)
  	}
  	pascalOrdinary(column, row)
  };System.out.println("""pascal: (column: Int, row: Int)Int""");$skip(47); 
  
  println("Welcome to the Scala worksheet");$skip(34); 
  
  println("Pascal's Triangle");$skip(103); 
  for (row <- 0 to 10) {
    for (col <- 0 to row)
      print(pascal(col, row) + " ")
    println()
}}
  
}