package lectures.part1basics

object ValuesVariablesTypes extends App
{
  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  // compiler can infer types

  val aString: String = "hello"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 9999
  val aLong: Long = 4832740281820L
  val aFloat: Float = 2.0F
  val aDouble: Double = 2.0D

  // variables
  var aVariable: Int = 4

  aVariable = 5  // side effect
}
