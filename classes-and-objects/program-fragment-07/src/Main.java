/**
 * Description: TODO
 *
 * @author auart
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //通过键盘输入书名、作者和价格
        Scanner sc = new Scanner(System.in);
        String title = sc.next();
        String author = sc.next();
        double price = sc.nextDouble();
        Book book = new Book(title, author, price);
        System.out.println("title: " + book.getTitle());
        System.out.println("author: " + book.getAuthor());
        System.out.println("price: " + book.getPrice());
    }
}

class Book {
    private String title;
    private String author;
    private Double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //编写类Book，在该类中定义了3个成员变量，即title表示书名、author表示作者、price表示价格。此外，还有3个get方法分别用来获取书名、作者和价格。
    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

}