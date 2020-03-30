object RomanToInteger {
  def romanToInt(s: String): Int = {
    var an = 0
    var x = 0

    while (x < s.length) {

      if ((x+2 <= s.length) && (rint(s.charAt(x).toString) < rint(s.substring(x + 1, x + 2)))) {
        an += rint(s.substring(x + 1, x + 2)) - rint(s.charAt(x).toString)
        x += 2
      } else {
        an += rint(s.charAt(x).toString)
        x += 1
      }
    }

    an
  }

  def rint(s: String): Int = {
    val rom = List(("I", 1), ("V", 5), ("X", 10), ("L", 50), ("C", 100), ("D", 500), ("M", 1000))

    rom.find(x => x._1 == s) match {
      case Some(a) => a._2
      case None => 0
    }
  }
}
