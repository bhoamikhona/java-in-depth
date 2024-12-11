public class Menu {

  public static double getMenuItemPrice(int choice) {
    double itemPrice = 0.0;

    switch (choice) {
      case 1:
        itemPrice = 12.0; // (Pizza)
        break;
      case 2:
        itemPrice = 8.0; // (Burger)
        break;
      case 3:
        itemPrice = 10.0; // (Salad)
        break;
      case 4:
        itemPrice = 15.0; // (Pasta)
        break;
      case 5:
        itemPrice = 7.0; // (Sandwich)
        break;
      case 6:
        itemPrice = 9.0; // (Sushi)
        break;
      case 7:
        itemPrice = 3.0; // (Soft Drink)
        break;
      case 8:
        itemPrice = 3.0; // (Coffee)
        break;
      case 9:
        itemPrice = 5.0; // (Cake)
        break;
      case 10:
        itemPrice = 6.0; // (Ice Cream)
        break;
      default:
        itemPrice = 0.0;
        break;
    }

    return itemPrice;
  }

  public static double applyCoupon(String couponCode) {
    double discount = 0.0;

    switch (couponCode) {
      case "SAVE4":
        discount = 4.0;
        break;
      case "HAPPYHOUR":
        discount = 5.0;
        break;
      case "SPECIAL3OFF":
        discount = 3.0;
        break;
      case "SUNDAY2OFF":
        discount = 2.0;
        break;
      case "GOODSTUDENT":
        discount = 2.0;
        break;
      default:
        discount = 0.0;
        break;
    }

    return discount;
  }
}