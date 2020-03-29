import org.scalatest._

class TwoSumTest extends FlatSpec with Matchers{

  "TwoSum" should "it should be [0,1]" in {
    val arr: Array[Int] = Array(2,7,11,15)
    TwoSum.twoSum(arr, 9) should be (Array(0,1))
  }

}
