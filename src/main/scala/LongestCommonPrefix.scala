object LongestCommonPrefix {
  def longestCommonPrefix(strs: Array[String]): String = {
    import util.control.Breaks._

    var an = ""
    var d = 0

    breakable{
      if (strs.length > 0) {
        for (z <- strs(0).indices) {
          for (x <- strs.indices) {
            for (c <- strs(x).indices) {
              if ((z == c) && (strs(x).charAt(c) == strs(0).charAt(z))) d += 1
            }
          }

          if (d == strs.length) an += strs(0).charAt(z) else break()

          d = 0
        }
      }
    }

    an
  }
}
