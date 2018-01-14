import org.junit.Test;

import static org.junit.Assert.*;

public class BookTestTest {

    @Test
    public void account() {
        Book book = new Book();
        book = new BookStore().selectBook(1001);
        double price = book.getPrice()*book.getDiscount();



    }
}