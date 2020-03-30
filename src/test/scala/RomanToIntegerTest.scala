import org.scalatest._

class RomanToIntegerTest extends FlatSpec with Matchers{
  "RomanToInteger" should "convert III to 3" in {
    RomanToInteger.romanToInt("III") should be (3)
  }

  it should "let IV to 4" in {
    RomanToInteger.romanToInt("IV") should be (4)
  }
}
