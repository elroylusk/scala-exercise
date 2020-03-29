object ReverseInteger {
  def reverse(x: Int): Int = {
    var an = List[String]()
    for (z <- x.toString.toList) {
      if (z.isDigit) an = an.+:(z.toString)
    }

    try {
      if (x < 0) an.+:("-").mkString.toInt else an.mkString.toInt
    } catch {
      case _: Exception => 0
    }
  }
}
