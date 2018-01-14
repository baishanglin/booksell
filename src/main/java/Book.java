public class Book {
    private int bookId;
    private String bookName;
    private double price;
    private String bookStyle; //图书畅销度
    private double discount;//折扣
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getbookStyle() {
        return bookStyle;
    }
    public void setbookStyle(String bookStyle) {
        this.bookStyle = bookStyle;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public Book() {
    }
    public Book(int bookId, String bookName, double price,String bookStyle,double discount) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.bookStyle = bookStyle;
        this.discount = discount;
    }

}
