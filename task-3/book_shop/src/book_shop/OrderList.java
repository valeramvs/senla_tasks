package book_shop;

public class OrderList {

    public static Order[] orders = new Order[10];

    public static int addOrder(Order order) {
        int id = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = order;
                id = i;
                break;
            }
        }
        return id;
    }
}
