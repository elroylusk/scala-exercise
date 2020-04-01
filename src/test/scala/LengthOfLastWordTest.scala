import org.scalatest._

class LengthOfLastWordTest extends FlatSpec with Matchers {
  "LengthOfLastWord" should "let 5 from \"Hello World\"" in {
    LengthOfLastWord.lengthOfLastWord("Hello World") should be (5)
  }
}
