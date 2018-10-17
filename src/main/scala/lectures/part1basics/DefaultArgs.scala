package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App
{
    @tailrec
    def factorial(n: BigInt, acc: BigInt = 1): BigInt =
    {
        if (n <= 1) acc
        else factorial( (n - 1), (n * acc) )
    }
}
