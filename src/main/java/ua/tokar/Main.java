package ua.tokar;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by vov on 03.05.2017.
 */
public class Main {


    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        BookService bookService =
                container.instance().select(BookService.class).get();
        Book book = bookService.createBook("H2G2", 12.5f, "Интересная книга на тему высоких технологий");
                System.out.println(book);
        weld.shutdown();
    }
}
