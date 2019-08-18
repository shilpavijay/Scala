object Factorial extends App {
    def factorial(n: Int) : Int = {
        def loop(acc: Int, n: Int) : Int =
            if (n == 0) acc
            else loop(acc*n,n-1)
        loop(1,n)
    }
    println(factorial(14))
}
//Output:
//1278945280