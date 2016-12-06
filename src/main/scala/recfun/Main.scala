package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    println("Parentheses Balancing")
    val testString1 = "((one)(two)((three)four))"
    println(balance(testString1.toList))
    val testString2 = ""
    println(balance(testString2.toList))
    val testString3 = "()))))))))))))"
    println(balance(testString3.toList))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c==0) 1
      else if (r==c) 1
      else pascal(c-1,r-1)+pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      val `(` = "(".charAt(0)   // or "(".toList(0)
      val `)` = ")".charAt(0)



    // if there is an opening bracket               -(- ()())
    // then find a closing bracket
        // if there is another opening bracket       ( -(- )())
        // then find closing bracket
            // if closing brakcet - OK               ((   -)- ())
        // if there is another opening bracket       (()     -(- ))
        // then find closing bracket
            // if closing bracket - OK               (()      ( -)- )
        // if closing bracket - OK
    // OK

    // check for empty sting
      if (chars.isEmpty) true

      if (chars.head == `(`) findClosingParenthesis(chars.tail, false)

      else if (chars.head == `)`) return false

      else balance(chars.tail)


//
      def findClosingParenthesis(tailChars: List[Char], state: Boolean): Boolean = {
        println(tailChars, state)
        if (tailChars.isEmpty) return state
        else if (tailChars.head == `)` ) return true
        if (tailChars.head == `(` ) findClosingParenthesis(tailChars.tail, false)
        else findClosingParenthesis(tailChars.tail, state)
      }
//
//      if (chars.isEmpty) return true
//
//      if (chars.head == `(`) findClosingParenthesis(chars.tail, false)
//
//      else if (chars.head == `)`) return false
//
//      else balance(chars.tail)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = 1
  }
