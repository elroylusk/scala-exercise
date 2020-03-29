import util.control.Breaks._

object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    var an: Array[Int] = Array()

    breakable {
      for (i <- nums.indices; j <- nums.indices) {
        if ((i != j) && (nums(i)+nums(j) == target)) {
          an = Array(i.toInt, j.toInt)
          break()
        }
      }
    }
    an
  }
}