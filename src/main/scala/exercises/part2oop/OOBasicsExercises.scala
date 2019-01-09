package exercises.part2oop

object OOBasicsExercises extends App
{
    val writer = new Writer("Jason", "Kilgrow", 1970)
    println(writer.fullName())

    val book = new Novel("The Name", 2018, author = writer)
    println(book.authorAge)
    println(book.isWrittenBy)

    val copyBook = book.copy(2019)
    println(copyBook.authorAge)
    println(copyBook.isWrittenBy)

    def counter = new Counter(4)
    println(counter.count)

    println("should be 5: " + counter.inc.count)

    println("should be 7: " + counter.inc.inc.inc.count)

    println("should be 10: " + counter.inc(6).count)

}
