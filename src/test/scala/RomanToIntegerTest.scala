import org.scalatest._

class RomanToIntegerTest extends FlatSpec with Matchers{
  "RomanToInteger" should "let 3 from III" in {
    RomanToInteger.romanToInt("III") should be (3)
  }

  it should "let 4 from IV" in {
    RomanToInteger.romanToInt("IV") should be (4)
  }

  it should "let 9 from IX" in {
    RomanToInteger.romanToInt("IX") should be (9)
  }

  it should "let 58 from LVIII" in {
    RomanToInteger.romanToInt("LVIII") should be (58)
  }

  it should "let 1994 from MCMXCIV" in {
    RomanToInteger.romanToInt("MCMXCIV") should be (1994)
  }
}
