import org.scalatest._

class PalindromeNumberTest extends FlatSpec with Matchers {
  "PalindromeNumber" should "get true from 121" in {
    PalindromeNumber.isPalindrome(121) should be (true)
  }

  it should "get false from -121" in {
    PalindromeNumber.isPalindrome(-121) should be (false)
  }

  it should "get false from 10" in {
    PalindromeNumber.isPalindrome(10) should be (false)
  }
}
