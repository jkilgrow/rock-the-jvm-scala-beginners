package exercises.part2oop

class Writer(fname: String, surname: String, val yearOfBirth: Int)
{
    def fullName(): String = fname + " " + surname;

}
