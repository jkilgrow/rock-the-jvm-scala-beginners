package lectures.part1basics

object StringOps extends App
{
    val str: String = "Hello, I am learning Scala"

    println('a' +: str :+ 'z')  // scala prepend ( +: ) and append ( :+ ) operators

    // scala specific: string interpolators

    // S-interpolators
    val name = "David"
    val age = 12
    val greeting = s"Hello, my name is $name and I am $age years old."
    val anotherGreeting = s"Hello, my name is $name and I will be ${age + 1} years old in a few months."
    println(anotherGreeting)

    // F-interpolators: formatted string similar to printf
    val speed = 1.2f
    val myth = f"$name can eat $speed%2.2f burgers per minute"
    println(myth)

    // raw interpolator
    println(raw"This is a \n newline") // raw strings are not escaped
    val escaped = "This is a \n newline"
    println(raw"$escaped")  // injected values are escaped

}
