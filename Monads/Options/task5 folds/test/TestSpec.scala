import org.scalatest.{MustMatchers, WordSpec}
class TestSpec extends WordSpec with MustMatchers {

  "Q1" must {
    "return are you hungry" in new Task {
      regular mustBe "are you hungry"
    }
  }
  "Q2" must {
    "return hungry you are" in new Task {
      yoda mustBe "hungry are you"
    }
  }

  "Q3" must {
    "return 4 when Some(3)" in new Task {
      shouldBe4 mustBe 4
    }
    "return 0 when None" in new Task {
      shouldBe0 mustBe 0
    }
  }

  "Q4" must {
    "return the correct sentence" in new Task {
      joinedStrings mustBe "I hate folds so I won't use them here!"
    }
  }
  "Q5" must {
    "return 10" in new Task {
      total mustBe 10
    }
  }
}
