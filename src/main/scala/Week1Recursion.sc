
  1+3
  def abs(x: Double) = if (x<0) -x else x

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.0001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }


  sqrt(2)

  sqrt(144)

  sqrt(1e-20)

  sqrt(1e60)


  //TailRecursion version of factorial

  // This is NOT tail recursive, because the last computation is NOT a call to itself
  // therefore the final computation will be:
  //  x * (fact(x-1) * ((fact(x-2) * (fact(x-3) * ... * fact(x-n)))))
  def factorial(x: Int): Int = {
    if (x == 0 ) 1 else x * factorial(x-1)
  }
  factorial(5)
  def tailRecursiveFactorial(x: Int): Int ={

    def loop(accumulator: Int, n: Int): Int = {
      if (n==0) accumulator else loop(accumulator * n, n-1)
    }
    loop(1, x)
  }

  tailRecursiveFactorial(5)