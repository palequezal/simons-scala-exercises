
class EmptyBoxException extends Exception("This box doesn't have any contents because it is empty")

abstract class Box2[+A] {

  def isEmpty: Boolean
  def contents: A

  def map[B](methodToActOnContents: A => B): Box2[B] =
    if (isEmpty) Empty else Full(methodToActOnContents(this.contents))


  // It's this bit that turns it into a Monad. The rest makes it a Functor
  def flatMap[B](methodToActOnContents: A => Box2[B]): Box2[B] =
    if (isEmpty) Empty else methodToActOnContents(this.contents)

}

case class Full[A](contents: A) extends Box2[A] {
  val isEmpty = false
}

case object Empty extends Box2[Nothing] {
  val isEmpty = true
  def contents = throw new EmptyBoxException
}