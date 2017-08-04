package book.database.demo.controllers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MyBook {
    @NotNull
    @Size(min = 4, max = 50)
    private String title;
    @NotNull
    @Size(min = 4, max = 70)
    private String author;
    @NotNull
    @Size(min = 4, max = 100)
    private String description;
    @NotNull
    @Size(min = 4, max = 50)
    private String sku;

    private double price;
    @Min(1)
    @Id
    @NotNull
    private long id;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
