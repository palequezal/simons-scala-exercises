sealed trait Fish

case object Cod extends Fish
case object Plaice extends Fish

sealed trait Chips

case object Regular extends Chips
case object Battered extends Chips

case class FishAndChips(fish: Fish, chips: Chips)

object Main {
   def main(args: Array[String]): Unit = {
      // this should work as we expect
      println(prepareOrder(Plaice, Battered))

      /* this should return a NullPointerException, which breaks the contract the method signature establishes
         (i.e. it says that the method always returns FishAndChips) */
      println(prepareOrder(fish = null, Regular))

      /* This is better because we abstract the null checks into option, we can reason that the values might not
         be there just by looking at the signature and we also can see that the output is either
         Some(FishAndChips()) or None and NEVER null.
      */
      println(prepareOrderImproved(Some(Cod), Some(Battered)))
      println(prepareOrderImproved(optFish = None, Some(Regular)))
   }

   // Bad
   def prepareOrder(fish: Fish, chips: Chips): FishAndChips =
      if (fish == null) null
      else if (chips == null) null
      else FishAndChips(fish, chips)

   // Good
   def prepareOrderImproved(optFish: Option[Fish], optChips: Option[Chips]): Option[FishAndChips] =
      for {
         fish <- optFish
         chips <- optChips
      } yield FishAndChips(fish, chips)
}