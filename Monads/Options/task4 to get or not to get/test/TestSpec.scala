import org.scalatest.{FunSuite, MustMatchers, WordSpec}

import java.time.LocalDate

class TestSpec extends WordSpec with MustMatchers {

  val testDate = LocalDate.of(2020, 3, 1)

  "firstDayIWasSickOfCovid" must {
    "return the default date if a day before the 1st of March is provided" in new Task {
      val testEarlyDate = LocalDate.of(2020, 2, 28)
      firstDayIWasSickOfCovid(Some(testEarlyDate)) mustBe testDate
    }
    "return the default date if nothing provided" in new Task {
      firstDayIWasSickOfCovid(None) mustBe testDate
    }
    "return the provided date if anything after is provided" in new Task {
      val testAfterDate = LocalDate.of(2021, 2, 28)
      firstDayIWasSickOfCovid(Some(testAfterDate)) mustBe testAfterDate
    }
  }

}
