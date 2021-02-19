sealed trait Fish

case object Cod extends Fish
case object Plaice extends Fish

sealed trait Chips

case object Regular extends Chips
case object Battered extends Chips

case class FishAndChips(fish: Fish, chips: Chips)

class FishAndChipService {

  def prepareOrderImproved(optFish: Option[Fish], optChips: Option[Chips]): Option[FishAndChips] =
    for {
      fish <- optFish
      chips <- optChips
    } yield FishAndChips(fish, chips)

  def describeOrders(orders: Seq[FishAndChips]): Seq[String] = ???

}
