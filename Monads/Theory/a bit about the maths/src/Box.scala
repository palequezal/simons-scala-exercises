
class Box[A](val contents: A) {

  // map() takes a method we define to do something to the box's contents and returns us a new
  // box containing the updated value
  def map[B](methodToActOnContents: A => B): Box[B] = {
    new Box(methodToActOnContents(contents))
  }

}

object Box {
  // apply|() puts something in the box
  def apply[T](contents: T): Box[T] = new Box(contents)
}

case object Toy
case object Biscuit