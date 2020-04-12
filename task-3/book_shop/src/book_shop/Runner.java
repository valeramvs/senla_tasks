package book_shop;

public class Runner {

    public static void main(String[] args) {

        Storage storage = new Storage();
        Request requests = new Request();

        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("Harry Potter 2");
        Book book3 = new Book("Harry Potter 3");
        Book book4 = new Book("The Lord of the Ring");
        Book book5 = new Book("The Lord of the Ring 2");
        Book book6 = new Book("The Lord of the Ring 3");

        /**
         * Добавление книг на склад
         */
        storage.addBook(book1);
        storage.addBook(book2);
        for (int i = 0; i < 5; i++) {
            storage.addBook(book4);
        }
        storage.addBook(book5);

        /**
         * Создание первого заказа с последующей оплатой.
         */
        Order order1 = new Order();
        order1.makeOrder(book4);
        order1.payOrder();

        /**
         * Удаление экземпляра книги со склада и проверка.
         */
        storage.removeBook(book4);
        storage.showStorage();

        /**
         * Создание второго заказа на отсутствующую книгу.
         * Проверка работы листа запросов.
         */
        Order order2 = new Order();
        order2.makeOrder(book3);
        order2.payOrder();
        storage.showStorage();
        requests.showRequests();

        /**
         * Добавление ранее отсутствующей книги.
         * Проверка оплаты и работы листа запросов.
         */
        storage.addBook(book3);
        order2.payOrder();
        storage.showStorage();
        requests.showRequests();

        /**
         * Удаление книги и последующее оформление заказа на неё.
         * Проверка работы листа запросов.
         * Добавление отсутствующей книги и оплата заказа.
         */
        storage.removeBook(book1);
        Order order3 = new Order();
        order3.makeOrder(book1);
        requests.showRequests();
        storage.addBook(book1);
        storage.showStorage();
        order3.payOrder();

        storage.showStorage();
        requests.showRequests();
    }

}
