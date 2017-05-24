package Gonsalves_validation;

import com.sun.jndi.cosnaming.IiopUrl;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by vov on 18.05.2017.
 */
public class Customer {
    @NotNull
    @Size(min = 2)
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String phoneNumber;
    @Past
    private Date dateOfBirth;
    private IiopUrl.Address deliveryAddress;

    public Customer(String firstName, String lastName, String email, String phoneNumber, Date dateOfBirth, IiopUrl.Address deliveryAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.deliveryAddress = deliveryAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public IiopUrl.Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDeliveryAddress(IiopUrl.Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    // Конструкторы, геттеры, сеттеры

}
