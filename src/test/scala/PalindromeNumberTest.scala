import org.scalatest._

class PalindromeNumberTest extends FlatSpec with Matchers {
  "PalindromeNumber" should "get true from 121" in {
    PalindromeNumber.isPalindrome(121) should be (true)
  }
}
