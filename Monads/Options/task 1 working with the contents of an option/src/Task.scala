

class Task {

  // This should return something like:
  // "Order: Cod and Battered" or "Order: Plaice and Regular" when an order exists
  // Edit the describeOrders method to make it work as expected
  def describeOrder(optFishAndChipOrder: Option[FishAndChips]): Option[String] =
    optFishAndChipOrder.map(order => s"Order: ${order.fish} and ${order.chips}")

}

