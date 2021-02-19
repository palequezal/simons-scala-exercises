import org.scalatest.{FunSuite, Matchers, MustMatchers, WordSpec}

class TestSpec extends WordSpec with MustMatchers {
  "The Fish and Chip shop" must {
    "describe the orders correctly" in new Task(new FishAndChipService) {
      yourOrder mustBe "Order: Cod and Battered, Order: Plaice and Regular"
    }
  }

}
