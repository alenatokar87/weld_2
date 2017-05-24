package ua.tokar;

import javax.inject.Inject;

/**
 * Created by vov on 27.04.2017.
 */
public class BookService {
    @Inject
    @ThirteenDigits
    private NumberGenerator numberGenerator;
    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }

}
