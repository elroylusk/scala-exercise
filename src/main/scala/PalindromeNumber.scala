object PalindromeNumber {
  def isPalindrome(x: Int): Boolean = {
    import util.control.Breaks._
    var an: Boolean = true

    breakable {
      for (z <- x.toString.indices) {
        if (x.toString.charAt(z) != x.toString.charAt(x.toString.length - z - 1)) {
          an = false
          break()
        }
      }
    }
    an
  }
}
