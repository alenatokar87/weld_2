package ua.tokar;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

/**
 * Created by vov on 03.05.2017.
 */
public class LoggingProducer {
    @Produces
    public Logger produceLogger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().
                getName());
    }
}
