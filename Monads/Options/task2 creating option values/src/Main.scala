import org.scalatest.MustMatchers

object Main extends MustMatchers {

   // Fill your answers in here to the questions below
   val answer1: Option[Int] = Some(1)
   val answer2: Option[Int] = Some(3)
   val answer3: Option[String] = Some("two")
   val answer4: Option[String] = Some("1")
   val answer5: Option[Int] = Some(0)
   val answer6: Option[String] = None
   val answer7: Option[String] = None
   val answer8: Option[Int] = Some(1)
   val answer9: Option[Int] = Some(1)
   val answer10: Option[Int] = None
   val answer11: Option[String] = Some("37")

   def main(args: Array[String]): Unit = {

      /* Remember, Option monad takes a type annotation to describe what it contains, e.g. Option[T]
         where T can be any type of your choice */

      // Q1: Make an Option that contains the number 1
      val optInt: Option[Int] = answer1

      // Q2
      optInt.map (_ + 2) mustBe answer2

      // Q3
      optInt map (_ => "two") mustBe answer3

      // Q4
      optInt map (value => value.toString) mustBe answer4

      // Q5
      optInt map { value => value - 1 } mustBe answer5

      // Q6
      val emptyOptString: Option[String] = answer6

      // Q7
      emptyOptString.map(_.toLowerCase) mustBe answer7

      // Q8
      val whatDoesThisDo = Option(1)
      whatDoesThisDo mustBe answer8

      // Q9
      val howAboutThis = Option.apply(1)
      howAboutThis mustBe answer9

      // Q10
      val orThis = Option.empty
      val result: Option[Int] = orThis
      result mustBe answer10

      // Q11
      val intOpt = Some(10)
      val added = intOpt.map(_ + 35)
      val subtracted = added.map(_ - 8)
      val stringified = subtracted.map(_.toString)

      stringified mustBe answer11

      AnswerChecker.checkAnswers
   }

}