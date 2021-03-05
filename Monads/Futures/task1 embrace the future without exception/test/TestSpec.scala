import org.scalatest.{MustMatchers, WordSpec}

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

class TestSpec extends WordSpec with MustMatchers {

  def await[T](f: Future[T]): T  = Await.result(f, 5 seconds)

  "Answer 1" must {
    "return Simon" in new Task {
      await(answer1) mustBe "Simon"
    }
  }
  "Answer 2" must {
    "return an exception" in new Task {
      intercept[IllegalArgumentException] {
        await(answer2)
      }
    }
  }

  "getName" must {
    "return 42" in new Task {
      await(getName) mustBe 42
    }
  }

}
