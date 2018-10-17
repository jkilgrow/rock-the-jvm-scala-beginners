package lectures.part1basics

object Recursion extends App
{
    def factorial(n: Int): Int =
    {
        if (n <= 1) 1
        else
        {
            println("Computing factorial of " + n + " but first I need factorial of " + (n - 1))
            val result = n * factorial(n - 1)
            println("Computed factorial of " + n)
            result
        }
    }

//    println(factorial(10))


    def anotherFactorial(n: BigInt): BigInt =
    {
        def factorialHelper(x: BigInt, accumulator: BigInt): BigInt =
        {
            if (x <= 1) accumulator
            else factorialHelper(x - 1, x * accumulator)
        }

        factorialHelper(n, 1)

        /*
         * anotherFactorial(10) = factorialHelper(10, 1)
         * = factorialHelper(9, 10 * 1)
         * = factorialHelper(8, 9 * 10 * 1)
         * = factorialHelper(7, 8 * 9 * 10 * 1)
         * ...
         * = factorialHelper(2, 3 * 4 * ... * 10 * 1)
         * = factorialHelper(1, 2 * 3 * ... * 10 * 1)
         */
    }

    println("anotherFactorial(50000) = " + anotherFactorial(50000))

    /*
     * The reason factorialHelper works is because as the last expression of its code path.
     * This allows scala to preserve the same stack frame and not use additional stack frames for recursive calls.
     *
     * In the first implementation, scala needed a recursive call stack frame for each recursive call.
     * So that it computes the intermediate result so that it can multiply it with a number so it can pass it back from the stack.
     *
     * In the second one, scala doesn't need to save intermediate results to be used later. So, when you evalutate the recursive call,
     * the current stack frame (factorialHelper(10)) is replaced with factorialHelper(something else) without using extra stack
     * memory.
     *
     * This is called TAIL RECURSION. The key to tail recursion is to use a recursive call as the LAST EXPRESSION on each
     * code path where it occurs.
     *
     * If you aren't sure if your function is tail recursive, you can add @tailrec to tell the compiler that the function
     * is supposed to be tail recursive. If the function is not tail recursive, the compiler issues an error.
     *
     * Using tail recursion is key to achieving the recursion over iteration approach that is necessary in functional
     * programming.
     *
     * When you need loops, use tail recursion.
     */
}
