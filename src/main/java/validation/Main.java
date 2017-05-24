package validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();

        Product iphone = new Product("Iphone", new BigDecimal(0.01),new Date(1),new Date(500));
        Order order = new Order(iphone, 10, "Самый лучший телефон");
        //Set<ConstraintViolation<Order>> validate = validator.validate(order,GroupForCh.class);

        Set<ConstraintViolation<Order>> validate = validator.validate(order);


        System.out.println(":::: validate = " + validate.size());
        for (ConstraintViolation<Order> s : validate) {
            System.out.println(s);
        }
        vf.close();
    }

}
