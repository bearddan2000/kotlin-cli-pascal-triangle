
// Function to print first
// n lines of Pascal's Triangle
fun printPascal(n:Int)
{
    var line = 0

    // Iterate through every line
    // and print entries in it
    while (line < n)
    {
        // Every line has number of
        // integers equal to line number
        var i = 0
        while (i <= line)
        {
            val j = binomialCoeff(line, i)
            print("$j ")
            i++
        }

        println()
        line++
    }
}

// Link for details of this function
// https://www.geeksforgeeks.org/space-and-time-efficient-binomial-coefficient/
fun binomialCoeff(n:Int,k:Int): Int
{
    var res = 1
		var x = k

    if (k > n - k) {x = n - k}

    var i = 0

    while (i < x)
    {
        res *= (n - i)
        res /= (i + 1)
        ++i
    }
    return res
}

fun main() {
  val N: Int = 10
  println("[INPUT] " + N)
  println("[OUTPUT]")
  printPascal(N)
}
