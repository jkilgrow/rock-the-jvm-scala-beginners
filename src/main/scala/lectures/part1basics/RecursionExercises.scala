package lectures.part1basics

import scala.annotation.tailrec

object RecursionExercises extends App
{
    /*
     * 1. Concatenate a string n times using tail recursion
     * 2. isPrime function using tail recursion
     * 3. fibonacci function using tail recursion
     *
     * HINT: Use accumulators to store intermediate results rather than call the function recursively.
     *       You need as many accumulators as you have recursive calls on your code path. Sometimes you need
     *       more than one accumulator.
     */

    // 1. concatenate a string n times
    @tailrec
    def concat(str: String, n: Int, con: String): String =
    {
        if (n < 1) con
        else concat(str, n - 1, con + str)
    }
    println(concat("con ", 3, ""))

    // 2. isPrime function
    def prime(n: Int): Boolean =
    {
        print("is " + n + " prime: ")
        @tailrec
        def isPrimeUntil(t: Int): Boolean =
        {
            if (t <= 1) true
            else (n % t != 0) && isPrimeUntil(t - 1)
        }
        isPrimeUntil(n / 2)
    }
    println(prime(17))

    // suggested answer from the course
    def isPrime(n: Int): Boolean =
    {
        print("is " + n + " prime: ")

        @tailrec
        def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
        {
            if (!isStillPrime) false
            else if (t <= 1) true
            else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
        }

        isPrimeTailRec(n / 2, true)
    }
    println(isPrime(2003))
    println(isPrime(629))



    // 3. fibonacci function using tail recursion
    def fibonacci(n: BigInt): BigInt =
    {
        def fibAccum(firstAccum: BigInt, secondAccum: BigInt): BigInt =
        {
            if (firstAccum < n) fibAccum(firstAccum + 1, firstAccum + 2)
            else (firstAccum + secondAccum)
        }

        fibAccum(0, 0)
    }

    /*
     * number: 0  1  2  3  4  5  6  7  8
     * fib   : 0  1  1  2  3  5  8  13 21
     *
     * fibonacci(5) = fibAccum(5,0)
     * =
     */

    // suggested solution
    def fibo(n: Int): Int =
    {
        def fiboTail(i: Int, last: Int, nextToLast: Int): Int =
        {
            if (i >= n) last
            else fiboTail(i + 1, last + nextToLast, last)
        }

        // this if/else is purely used as a starting point. it is not part of the recursion.
        if (n <= 2) 1
        else fiboTail(2, 1, 1)

    }
    println(fibo(8))
    /*
     * num: 1   2   3   4   5   6   7   8
     * fib: 1   1   2   3   5   8   13  21
     *
     * fibo(8) = fiboTail(2, 1, 1)
     * = fiboTail(3, 1 + 1, 1)
     * = fiboTail(4, 2 + 1, 2)
     * = fiboTail(5, 3 + 2, 3)
     * = fiboTail(6, 5 + 3, 5)
     * = fiboTail(7, 8 + 5, 8)
     * = fiboTail(8, 13 + 8, 13)
     * = 21
     */
}
