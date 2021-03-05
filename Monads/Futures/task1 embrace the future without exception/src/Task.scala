import scala.concurrent.Future

class Task {

  // Set this to a future that succeeds with the value "Simon"
  val answer1 = Future.successful("Simon")

  // Set this to a future that failed with an IllegalArgumentException
  val answer2 = Future.failed(new IllegalArgumentException(""))

  // Make this method return a Future containing the value 42, with
  // the correct type annotation
  def getName: Future[Int] = Future.successful(42)


}