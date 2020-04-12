package book_shop;

public class Order {

    private int id;
    private Status status;
    private Book book;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void makeOrder(Book book) {
        setBook(book);
        setId(OrderList.addOrder(this));
        Storage store = new Storage();
        this.status = Status.NEW;
        if (!store.getBook(book)) {
            Request.addRequest(book);
        }
        System.out.println("Made order " + getBook() + " status=" + getStatus() + " id=" + getId());
    }

    public void payOrder() {
        if (this.book.isAvailable()) {
            Storage store = new Storage();
            store.getBook(this.getBook());
            this.setStatus(Status.DONE);
            this.book.setAmount(this.book.getAmount() - 1);
            if (this.book.getAmount() == 0) {
                this.book.setAvailable(false);
            }
            System.out.println("Made order " + getBook() + " status=" + getStatus() + " id=" + getId());
        } else {
            System.out.println("Failed to pay order " + getBook() + " status=" + getStatus() + " id=" + getId() + ". book_shop.Book is not available yet.");
        }
    }

    public void cancelOrder() {
        if (this.getStatus() == Status.NEW) {
            this.setStatus(Status.CANCELED);
            if (this.book.isAvailable()) {
                Storage store = new Storage();
                store.addBook(this.book);
            }
        }
        System.out.println("Made order " + getBook() + " status=" + getStatus() + " id=" + getId());
    }

}
