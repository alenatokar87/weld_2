package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;

/**
 * Created by vov on 22.05.2017.
 */
public class DateValidator implements ConstraintValidator<DataCheker, Product>  {

    public void initialize(DataCheker dataCheker) {

    }

    public boolean isValid(Product s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
