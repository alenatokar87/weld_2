package validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by vov on 22.05.2017.
 */

@Constraint(validatedBy = {DateValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE})
@Retention(RUNTIME)

public @interface DataCheker {
    String message() default "{HommeTask3.Dates.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

