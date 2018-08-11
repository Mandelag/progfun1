package week1

object pa {
  
  /**
   * Assignment 2
   */
  def balance(chars: List[Char]): Boolean = {
    true
  }                                               //> balance: (chars: List[Char])Boolean
  
  balance("This (is a) balanced strings!".toList) //> res0: Boolean = true
  
  /**
   * Assignment 1
   */
  def pascal(column: Int, row: Int): Int = {
  	def pascalOrdinary(c: Int, r: Int): Int = {
    	if (c == 0 || c == r) 1 else pascalOrdinary(c-1,r-1) + pascalOrdinary(c,r-1)
  	}
  	pascalOrdinary(column, row)
  }                                               //> pascal: (column: Int, row: Int)Int
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  println("Pascal's Triangle")                    //> Pascal's Triangle
  for (row <- 0 to 10) {
    for (col <- 0 to row)
      print(pascal(col, row) + " ")
    println()
}                                                 //> 1 
                                                  //| 1 1 
                                                  //| 1 2 1 
                                                  //| 1 3 3 1 
                                                  //| 1 4 6 4 1 
                                                  //| 1 5 10 10 5 1 
                                                  //| 1 6 15 20 15 6 1 
                                                  //| 1 7 21 35 35 21 7 1 
                                                  //| 1 8 28 56 70 56 28 8 1 
                                                  //| 1 9 36 84 126 126 84 36 9 1 
                                                  //| 1 10 45 120 210 252 210 120 45 10 1 
  
}