package Book;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Капитанская дочка", "А.С.Пушкин", 1320, "Исторический роман");
        Book b2 = new Book("Герой нашего времени", "М.Ю.Лермонтов", 423, "Психологический роман");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}
