package ua.tokar;

/**
 * Created by vov on 27.04.2017.
 */
public class Book {
    private String title;
    private Float price;
    private String description;
    private String number;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {

        return title;
    }

    public Float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }



    public Book(String title, Float price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;

    }
    public Book() {
    }

//Конструкторы, геттеры, сеттеры
}
