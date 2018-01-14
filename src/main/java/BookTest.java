import java.util.List;
import java.util.Scanner;

public class BookTest {

    private BookStore bStore = new BookStore();

    //查询图书
    public void showBook() {
        System.out.println("---------图 书 结 账 系 统--------");
        System.out.println("编号\t\t书名\t\t价格\t\t热度\t\t折扣\t\t");

        List<Book> list = bStore.getBkList();
        for (Book book : list) {
            System.out.print(book.getBookId() + "\t\t");
            System.out.print(book.getBookName() + "\t\t");
            System.out.print(book.getPrice() + "\t\t");
            System.out.print(book.getbookStyle() + "\t\t");
            System.out.print(book.getDiscount() + "\t\t");
            System.out.println();
        }
        System.out.println("请选择如下的操作：1.查询图书：  2.结账：  3.退出：");
        handle();
    }
    //功能
    public void handle() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a) {
            case 1:
                showBook();
                handle();
                break;
            case 2:
                account();
                handle();
                break;
            default:
                System.out.println("退出");
                break;
        }

    }
    //结账
    public void account() {
        System.out.println("请选择欲购买的图书：");
        System.out.println("请输入图书Id：");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        System.out.println("请输入购买数量:");
        int num = input.nextInt();

        Book book = bStore.selectBook(id);
        System.out.println("书名："+book.getBookName() + " 标价:" + book.getPrice()+"  折扣："+book.getDiscount());
        System.out.println("数量：" + num);

       /*
       if(book.getbookStyle()=="popular"){
            price = book.getPrice()*;   //畅销图书折扣1.2
        }else if(book.getbookStyle()=="normal"){
            price = book.getPrice()*1.0; //常规图书折扣1.0
        }else{
            price = book.getPrice()*0.6; //滞销图书折扣0.6
        }
        */

        System.out.println("小计：" + (num * book.getPrice()*book.getDiscount()));
        showBook();
    }

}
