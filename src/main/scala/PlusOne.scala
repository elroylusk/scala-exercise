import util.control.Breaks._

object PlusOne {
  def plusOne(digits: Array[Int]): Array[Int] = {
    if (digits.length == 0) Array(1)
    else {
      var next = false
      var dig = digits.reverse
      breakable {
        for (i <- dig.indices) {
          if (dig(i) + 1 == 10) {
            dig.update(i, 0)
            next = true
          } else if (next) {
            dig.update(i, dig(i) + 1)
            next = false
            break()
          } else {
            dig.update(i, dig(i) + 1)
            break()
          }
        }
        if (next) dig = dig :+ 1
      }
      dig.reverse
    }
  }
}
