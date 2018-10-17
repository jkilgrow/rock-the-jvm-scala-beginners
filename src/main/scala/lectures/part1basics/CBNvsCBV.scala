package lectures.part1basics

object CBNvsCBV extends App
{
    def calledByValue(x: Long): Unit =
    {
        println("by value: " + x)
        println("by value: " + x)
    }

    // the => operator tells the compiler that the parameter will be called by name
    def calledByName(x: => Long): Unit =
    {
        println("by name: " + x)
        println("by name: " + x)
    }

//    calledByValue(System.nanoTime())
//    calledByName(System.nanoTime())

    /*
     * Called by value: The expression is evaluated once and passed as a value to the function.
     * Called by name: The expression is passed as "System.nanoTime()" to the function and every time the function
     *                 references the value "x", it is re-evaluated. That is why we are getting different values in the
     *                 calledByName function.
     */

    def infinite(): Int = 1 + infinite()

    def printFirst(x: Int, y: => Int) = println(x)

//    printFirst(infinite(), 34) // stack overflow!
    printFirst(34, infinite())  // works fine?

    /*
     * Why does that second one work?
     * Because the => operator delays the evaluation of the expression until it is used. Since the only thing we are
     * doing in printFirst() is println(x), the expression for y, which is "infinite()" is never used and, therefore,
     * never evaluated. Hence, the execution works fine!
     */

}