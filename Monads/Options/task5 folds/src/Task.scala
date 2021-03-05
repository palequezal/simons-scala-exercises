class Task {

  val optHungry = Some("hungry")

  // Q1 make this read "are you hungry"
  val regular = optHungry.foldLeft("are you")( (left, right) => s"$left $right")

  // Q2 make this read "hungry you are"
  val yoda = optHungry.foldRight("are you")( (left, right) => s"$left $right")

  // Q3 use fold() to add 1 to each of these if they're Some() and replace with 0 if None
  def add1(optInt: Option[Int]): Int = optInt.fold(0)(_ + 1)

  val shouldBe4: Int = add1(Some(3))
  val shouldBe0: Int = add1(None)

  // Q4 join together this sequence of strings with spaces
  val strings = Seq("I", "hate", "folds", "so", "I", "won't", "use", "them", "here!")
  val joinedStrings = strings.mkString(" ")

  // Q5 Ego ergo ...? add all these up into 1 value
  val numbers = Seq(1,2,3,4)
  val total = numbers.sum

}