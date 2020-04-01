import org.scalatest._

class SearchInsertPositionTest extends FlatSpec with Matchers {

  "SearchInsertPosition" should "get 2 from [1,3,5,6], 5" in {
    SearchInsertPosition.searchInsert(Array(1,2,5,6), 5) should be (2)
  }

  it should "get 1 from [1,3,5,6], 2" in {
    SearchInsertPosition.searchInsert(Array(1,3,5,6), 2) should be (1)
  }

  it should "get 4 from [1,3,5,6], 7" in {
    SearchInsertPosition.searchInsert(Array(1,3,5,6), 7) should be (4)
  }

  it should "get 0 from [1,3,5,6], 0" in {
    SearchInsertPosition.searchInsert(Array(1,3,5,6), 0) should be (0)
  }
}
