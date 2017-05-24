package ua.tokar;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by vov on 27.04.2017.
 */
@ThirteenDigits
public class IsbnGenerator implements NumberGenerator{
    @Inject
    private Logger logger;
    @Loggable
    public String generateNumber(){
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Сгенерирован ISBN :" + isbn);
        return isbn;
    }
}
