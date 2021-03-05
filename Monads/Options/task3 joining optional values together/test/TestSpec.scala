import org.scalatest.{FunSuite, MustMatchers, WordSpec}

class TestSpec extends WordSpec with MustMatchers {

  val testFirstName = "Sam"
  val testLastName = "Smith"

  "fullName" must {
    "return the complete name when first and last name are populated" in new Task {
      fullName(Some(testFirstName), Some(testLastName)) mustBe Some(s"$testFirstName $testLastName")
    }
    "return None if first name is missing" in new Task {
      fullName(None, Some(testLastName)) mustBe None
    }
    "return None if last name is missing" in new Task {
      fullName(Some(testFirstName), None) mustBe None
    }
  }

}
