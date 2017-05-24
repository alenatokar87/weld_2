package validation;

import Gonsalves_validation.ZipCodeValidator;

import javax.validation.Constraint;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;
@DataCheker(message = "creationDate of product {Product.creationDate} can't be > or =Date expirationDate")
public class Product {
    // Имя продукта
    @NotNull (message = "name can't be an empty field")
    @Size(max=30,message = "name can't be  ")
    private String name;

    // Цена продукта
    @DecimalMin(value ="0.1", message = "Min price should be =  {value}")//, groups = GroupForCh.class)
    private BigDecimal price;
    //Дата создания продукта
    @Past
    private Date creationDate;
    //Срок годности
    @Future
    //@Constraint(validatedBy = DateValidator.class)
    private Date expirationDate;

    public Product(String name,
                   BigDecimal price,
                   Date creationDate,
                   Date expirationDate) {
        this.name = name;
        this.price = price;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
    }

}
