
abstract class Animal(val legs: Int) {
   val animalName = getClass.getSimpleName

   // Note how this method hasn't been implemented. Because it's an "abstract" class, we can have unimplemented methods
   def makeNoise: String

   def describe: String = s"A $animalName has $legs legs and goes '$makeNoise'!"
}

class Cat extends Animal(legs = 4) {
  override def makeNoise: String = "Miaow"
}

class Monkey extends Animal(legs = 2) {
   override def makeNoise: String = "Eek"
}

class Fish extends Animal(legs = 0) {
   override def makeNoise: String = "Flibble"
}

object Main {
   def main(args: Array[String]): Unit = {
      val cat = new Cat()
      val monkey = new Monkey()

      println(cat.describe)
      println(monkey.describe)

      // This one's a bit weird. Perhaps we need to change how we structure this code.
      // We'll look at how to do so in the 'Traits' lesson
      val fish = new Fish()
      println(fish.describe)
   }
}