public class CustomerOrder {

  static int orderNumber = 1000;
  double price = 10.0;
  double seniorDiscount = 2.0;
  int quantity = 1;
  boolean seniorCitizen;
  double orderAmount;

  public void generateOrderBill() {
    orderNumber = orderNumber + 1;

    orderAmount = price * quantity;

    if (seniorCitizen) {
      orderAmount = orderAmount - seniorDiscount;
    }
  }
}