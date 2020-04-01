object SearchInsertPosition {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    if (!nums.contains(target)) {
      (nums :+ target).toList.sorted.toArray.indexOf(target)
    } else {
      nums.indexOf(target)
    }
  }
}
