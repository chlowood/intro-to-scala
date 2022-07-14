package tutorials

object PatternMatchingDemo extends App{
  def whatNumber(x: Int) = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "3+"
  }



println(whatNumber(5))
}
