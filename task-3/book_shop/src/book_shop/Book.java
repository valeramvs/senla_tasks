package book_shop;

import java.util.Objects;

public class Book {
    private String name;
    private boolean available;
    private int amount;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
        this.available = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "book_shop.Book{" +
                "name='" + name + '\'' +
                ", available=" + available +
                ", amount=" + amount +
                '}';
    }
}
