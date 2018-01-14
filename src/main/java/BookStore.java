import java.util.ArrayList;
import java.util.List;

public class BookStore {
   private List<Book> bkList = new ArrayList<Book>();

    public BookStore(){
        Book book1 = new Book(1001,"Java",10,"popular",1.2);
        bkList.add(book1);
        Book book2 = new Book(1002,"C入门",10,"normal",1.0);
        bkList.add(book2);
        Book book3 = new Book(1003,"python",10,"unsala",0.6);
        bkList.add(book3);
        Book book4 = new Book(1004,"oracle",10,"unsala",0.6);
        bkList.add(book4);
    }
    public List<Book> getBkList(){
        return bkList;
    }
    public Book selectBook(int id ){
        Book book = new Book();
        for (int i = 0; i < bkList.size(); i++) {
            book = bkList.get(i);
            if(book.getBookId() == id){
                return book;
            }
        }
        return null;
    }
}
