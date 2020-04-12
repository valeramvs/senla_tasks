package book_shop;

public class Request {

    public static Book[] requests = new Book[10];

    public static void addRequest(Book book) {
        for (int i = 0; i < requests.length; i++) {
            if (requests[i] == null) {
                requests[i] = book;
                System.out.println(book.getName() + " is added to List book_shop.Request");
                break;
            }
        }
    }

    public static void scanRequests(Book book) {
        for (int i = 0; i < requests.length; i++) {
            if (requests[i] != null && requests[i].equals(book)) {
                System.out.println(book + " is in storage. Payment is expected.");
                requests[i] = null;
                break;
            }
        }
    }

    public void showRequests() {
        System.out.println("book_shop.Request list: ");
        for (Book request : requests) {
            System.out.println("\t" + request);
        }
    }

}
