package tutorials

// Write a function that takes 3 integers
// works out the largest number

object OurFunction extends App {
  def largest(a: Int, b: Int, c: Int): Int = {
    if (a > b && a > c) a else if (b > c) b else c
  }
  println(largest(5,9,12))
}

