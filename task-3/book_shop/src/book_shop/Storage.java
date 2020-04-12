package book_shop;

public class Storage {

    public static Book[] store = new Book[10];

    public void addBook(Book book) {
        for (Book value : store) {
            if (value != null && value.equals(book)) {
                book.setAvailable(true);
                book.setAmount(book.getAmount() + 1);
                System.out.println(book.getName() + " is added to book_shop.Storage");
                Request.scanRequests(book);
                return;
            }
        }
        for (int i = 0; i < store.length; i++) {
            if (store[i] == null) {
                store[i] = book;
                book.setAvailable(true);
                book.setAmount(book.getAmount() + 1);
                System.out.println(book.getName() + " is added to book_shop.Storage");
                break;
            }
        }
        Request.scanRequests(book);
    }

    public void removeBook(Book book) {
        for (Book value : store) {
            if (value.equals(book)) {
                book.setAmount(book.getAmount() - 1);
                if (book.getAmount() == 0) {
                    book.setAvailable(false);
                }
                System.out.println(book.getName() + " is removed from book_shop.Storage");
                break;
            }
        }
    }

    public boolean getBook(Book book) {
        for (Book value : store) {
            if (value != null && value.equals(book) && value.getAmount() > 0) {
                return true;
            }
        }
        return false;
    }

    public void showStorage() {
        System.out.println("book_shop.Storage: ");
        for (Book book : store) {
            System.out.println("\t" + book);
        }
    }
}
