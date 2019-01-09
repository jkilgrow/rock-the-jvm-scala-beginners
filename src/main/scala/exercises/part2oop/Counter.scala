package exercises.part2oop

class Counter(val count:Int = 0)
{
    def inc =
    {
        println("incrementing...")
        new Counter(count + 1)
    }

    def dec =
    {
        println("decrementing...")
        new Counter(count - 1)
    }

    def inc(n: Int): Counter =
    {
        if (n <= 0) this
        else inc.inc(n - 1)
    }

    def dec(n: Int): Counter =
    {
        if (n <= 0) this
        else dec.dec(n - 1)
    }
}
