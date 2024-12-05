public class CustomerOrder {
  static int orderNumber = 1000;

  static double seniorDiscount = 2.0;

  int quantity = 1;
  boolean seniorCitizen;

  double orderAmount = 0.0;

  CustomerOrder(int quantity, boolean seniorCitizen) {
    this.quantity = quantity;
    this.seniorCitizen = seniorCitizen;

    // Generate New Order Number
    orderNumber = orderNumber + 1;
  }

  CustomerOrder(int quantity) {
    this(quantity, false);
  }

  public double generateOrderBill() {
    // Compute Order Amount (orderAmount) using price & quantity
    orderAmount = Menu.price * quantity;

    // Apply discount if customer is a senior citizen
    if (seniorCitizen) {
      orderAmount = orderAmount - seniorDiscount;
    }

    return orderAmount;
  }

}