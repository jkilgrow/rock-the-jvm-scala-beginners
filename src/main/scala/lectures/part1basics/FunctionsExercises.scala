package lectures.part1basics

import java.time.Instant

object FunctionsExercises extends App
{
    /*
     * 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
     * 2. Factorial function => 1 * 2 * 3 * 4...* n
     * 3. Fibonacci function f(n) = f(n - 1) + f(n - 2)
     *    0 1 2 3 4 5 6  7  8  9
     *    0 1 1 2 3 5 8 13 21 34
     * 4. Tests if a number is prime
     */
    // 1. A greeting function
    def greeting(name: String, age: Int): String =
    {
        "Hello, my name is " + name + " and I am " + age + " years old."
    }

    println(greeting("Jimmy", 37))

    // 2. Factorial function
    def factorial(n: Int): Int =
    {
        if(n == 1) n
        else n * factorial(n - 1)
    }

    println(factorial(5))

    // 3. Fibonacci sequence of n
    def fibonacci(n: Int): Long =
    {
        var fib: Long = n

        if(n > 1)
        {
            fib = fibonacci(n - 1) + fibonacci(n - 2)
        }
        fib
    }

    val startInstFun:Long = Instant.now.getEpochSecond
    println(fibonacci(42))
    val stopInstFun:Long = Instant.now.getEpochSecond
    val diffFun:Long = stopInstFun - startInstFun
    println("startMillis: " + startInstFun)
    println("stopMillis: " + stopInstFun)
    println("diff: " + diffFun)

    // 4. Test if a number is prime
    def prime(n: Int): Boolean =
    {
        def isPrimeUntil(t: Int): Boolean =
        {
            if (t <= 1) true
            else (n % t != 0) && isPrimeUntil(t - 1)
        }

        isPrimeUntil(n / 2)
    }
    println("prime(15): " + prime(15))
}
