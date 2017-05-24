package Gonsalves_validation;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vov on 18.05.2017.
 */
public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {
   @Inject
   @USA
   private ZipCodeChecker checker;
   private Pattern zipPattern = Pattern.compile("\\d{5}(-\\d{5})?");

    public void initialize(ZipCode zipCode) {
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null)
            return true;

        Matcher m = zipPattern.matcher(value);
        if (!m.matches())
            return false;
        return checker.isZipCodeValid(value);
    }
}
