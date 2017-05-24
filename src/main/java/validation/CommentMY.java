package validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by vov on 19.05.2017.
 */
@NotNull(message = "validation.CommentMY.message2")
@Min(value =1, message = "{validation.CommentMY.Min.message}")
@Max(value = 50, message = "{validation.CommentMY.Max.message}")
@Constraint(validatedBy = {})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
public @interface CommentMY {
    String message() default "{validation.CommentMY.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
