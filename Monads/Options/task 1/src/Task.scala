

class Task(val service: FishAndChipService) {

  val orders = Seq(
    FishAndChips(Cod, Battered),
    FishAndChips(Plaice, Regular)
  )

  // This should return:
  // "Order: Cod and Battered, Order: Plaice and Regular"
  // Edit the describeOrders method in FishAndChipService to make it work as expected
  def yourOrder: String = service.describeOrders(orders).mkString(", ")

}

