import org.scalatest._

class ReverseIntegerTest extends FlatSpec with Matchers {
  "ReverseInteger" should "reverse 123" in {
    ReverseInteger.reverse(123) should be (321)
  }

  it should "let -123" in {
    ReverseInteger.reverse(-123) should be (-321)
  }

  it should "let 120" in {
    ReverseInteger.reverse(120) should be (21)
  }
}
