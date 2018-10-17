package lectures.part1basics

object Functions extends App
{
    def aFunction(a: String, b: Int): String =
    {
        a + " " + b
    }

    println(aFunction("hello", 3))

    def aParameterlessFunction(): Int =
    {
        42
    }

    println(aParameterlessFunction())
    println(aParameterlessFunction)

    def aRepeatedFunction(aString: String, n: Int): String =
    {
        if (n== 1) aString
        else aString + aRepeatedFunction(aString, n-1)
    }
    println(aRepeatedFunction("hello", 3000))

    // in a functional language like scala, you use recursion in places where you would use loops in imperitive languages

    def aFunctionWithSideEffects(aString: String):Unit = println(aString)

    def aBigFunction(n: Int): Int =
    {
        def aSmallFunction(a: Int, b: Int): Int = a + b

        aSmallFunction(n, n - 1)
    }
}
