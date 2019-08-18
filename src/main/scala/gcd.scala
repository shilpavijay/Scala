object gcd extends App{
    def gcd(x: Int, y: Int) : Int =
        if(y == 0) x else gcd(y, x % y)
    println(gcd(21,28))
    println(gcd(3,21))
}
/*
Output:
7
3
 */

