object SquareRoot extends App {

    def abs(x: Double): Double = if (x < 0) -x else x

    def sqrt(x: Double): Double = {

        def SqrtIter(guess: Double): Double =
            if (guessIsGood(guess)) guess
            else SqrtIter(improve(guess))

        def guessIsGood(guess: Double): Boolean =
            abs(guess * guess - x) / x < 0.001

        def improve(guess: Double): Double =
            (guess + x / guess) / 2

        SqrtIter(1.0)
    }

    println(sqrt(2))
    println(sqrt(3))
    println(sqrt(1e-6))
    println(sqrt(1e60))
}
