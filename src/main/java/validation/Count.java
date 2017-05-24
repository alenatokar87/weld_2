package validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.*;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by vov on 18.05.2017.
 */
@NotNull
@Min(value =1)
@Max(value = 7)
@Constraint(validatedBy ={})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)

public @interface Count {
    String message() default " {validation.Count.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
