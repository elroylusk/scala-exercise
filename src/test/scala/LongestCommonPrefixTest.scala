import org.scalatest._

class LongestCommonPrefixTest extends FlatSpec with Matchers {
  "LongestCommonPrefix" should "let \"fl\" from [\"flower\",\"flow\",\"flight\"]" in {
    LongestCommonPrefix.longestCommonPrefix(Array("flower","flow","flight")) should be ("fl")
  }

  it should "let '' from [\"dog\",\"racecar\",\"car\"]" in {
    LongestCommonPrefix.longestCommonPrefix(Array("dog","racecar","car")) should be ("")
  }
}
