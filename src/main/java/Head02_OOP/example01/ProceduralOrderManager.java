package Head02_OOP.example01;

public class ProceduralOrderManager {
    public static void main(String[] args) {
        String customer = "Alice";
        String product = "Book";
        int quantity = 2;
        int price = 15000;

        int totalPrice = quantity * price;
        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원입니다.\n",
                customer, product, quantity, totalPrice);
    }
}

class Order {
    String customerName;
    String product;
    int quantity;
    int price;

    Order(String customerName, String product, int quantity, int price) {
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    int getTotalPrice() {
        return quantity * price;
    }

    void printOrderSummary() {
        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원입니다.\n",
                customerName, product, quantity, getTotalPrice());
    }
}
