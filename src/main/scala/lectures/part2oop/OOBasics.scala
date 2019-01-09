package lectures.part2oop

import exercises.part2oop.Counter

object OOBasics extends App
{
    val person = new Person("Phteven", 5)
    println(person.age)
    person.greet("Phtephanie")
    person.greet()

}

// class parameters are not class properties
// name is a parameter but not a property
// age is a parameter and the val makes it a property as well
// this is the constructor
class Person(name: String, val age: Int)
{
    def this(name: String) = this(name, 0)

    val x = 2
    println(1 + x)

    // method
    def greet(name: String): Unit = println(s"${this.name} says: Hello, $name")

    // overloaded method
    def greet(): Unit = println(s"Hello, I am $name")
}
