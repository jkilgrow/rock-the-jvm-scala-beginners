package lectures.part1basics

object Expressions extends App
{
  val x = 1 + 2   // Expression is 1 + 2
  println(x)

  println(2 + 3 * 4)
  //   + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println( ! (1 == x) )
  // ! && ||

  var aVariable = 2
  aVariable += 3   // also works with -= *= /+   ...... side effects
  println(aVariable)

  // Instructions vs Expressions
  // Instructions tell the computer what to DO
  // Expressions have a value and/or a type
  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3   // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  while (i < 10)
    {
      println(i)
      i += 1
    }
  // NEVER WRITE THIS AGAIN

  // everything in scala is an expression

  val aWeirdValue = (aVariable = 3)  // Unit === void
  println(aWeirdValue)

  // side effects: println(), while, reassigning of vars  ...  all return Unit

  // code blocks - special kinds of expressions

  val aCodeBlock =
  {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  // a code block is an expression
  // the value of the block is the value of its last expression
  println(aCodeBlock)

  // instructions are EXECUTED - DO something
  // expressions are EVALUATED - give me the VALUE of something
}
