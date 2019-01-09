package exercises.part2oop

class Novel(name: String, yearOfRelease: Int, author: Writer)
{
    def authorAge: Int = yearOfRelease - author.yearOfBirth

    def isWrittenBy: String = author.fullName()

    def copy(newYearOfRelease: Int): Novel = new Novel(this.name, newYearOfRelease, this.author)
}
