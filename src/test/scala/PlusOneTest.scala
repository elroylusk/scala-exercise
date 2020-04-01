import org.scalatest._

class PlusOneTest extends FlatSpec with Matchers {
  "PlusOne" should "let [1,2,4] from [1,2,3]" in {
    PlusOne.plusOne(Array[Int](1,2,3)) should be (Array[Int](1,2,4))
  }

  it should "let [1,3,0] from [1,2,9]" in {
    PlusOne.plusOne(Array[Int](1,2,9)) should be (Array[Int](1,3,0))
  }

  it should "let [1,0] from [9]" in {
    PlusOne.plusOne(Array[Int](9)) should be (Array[Int](1,0))
  }

  it should "let [1,0,0] from [9,9]" in {
    PlusOne.plusOne(Array[Int](9,9)) should be (Array[Int](1,0,0))
  }
}
