package validation;




import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

/**
 * Created by vov on 17.05.2017.
 */
public class Order {
    // Класс продукт см.ниже
    @Valid
    @NotNull(message = "Product can't be an empty field")
    private Product product;

    // Количество товарf
    @Count
    private int count;

    //Комментарий к заказу

    @CommentMY
    private String comment;

    public Order(Product product,
                 int count,
                 String comment) {
        this.product = product;
        this.comment = comment;
        this.count = count;}

    }
