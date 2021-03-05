
object Main {
   def main(args: Array[String]): Unit = {
      /*
      BOX EXAMPLES
       */

      // Create a box containing a Toy
      val toyBox = Box(Toy)

      // create a new box that contains a Biscuit by swapping out the contents of the Toy box
      // Note that the original Toy box is unchanged by this -- it's a "val" after all
      val biscuitBox = toyBox.map(_ => Biscuit)

      // should print "Biscuit" to the terminal
      biscuitBox.map(println)

      /*
      BOX 2 EXAMPLES
       */

      val toyBox2 = Full(Toy)
      val biscuitBox2 = toyBox2.map(_ => Biscuit)

      // Should print "Full(Biscuit)" to the terminal
      println(biscuitBox2)

      val emptyBox = Empty

      // Should print "Empty" to the terminal because we defined our map() to only work on the box contents when the
      // box is Full
      val toyBox3 = emptyBox.map(_ => Toy)

      println(toyBox3)

   }
}