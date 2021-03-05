import org.scalatest.{FunSuite, Matchers, MustMatchers, WordSpec}

class TestSpec extends WordSpec with MustMatchers {

  "The Fish and Chip shop" must {
    "describe a Cod and Battered order correctly" in new Task {
      val order = Some(FishAndChips(Cod, Battered))
      describeOrder(order) mustBe Some("Order: Cod and Battered")
    }
    "describe a Plaice and Regular chips order correctly" in new Task {
      val order = Some(FishAndChips(Plaice, Regular))
      describeOrder(order) mustBe Some("Order: Plaice and Regular")
    }
    "return nothing if the order is None" in new Task {
      val order = None
      describeOrder(order) mustBe None
    }
  }

}
