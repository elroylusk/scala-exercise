object LengthOfLastWord {
  def lengthOfLastWord(s: String): Int = {
    if (s.replace(" ", "").length > 0) s.replace("  ", " ").split(" ").last.length else 0
  }
}
