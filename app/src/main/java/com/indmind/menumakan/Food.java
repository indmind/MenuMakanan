package com.indmind.menumakan;

public class Food {
    private String name;
    private String price;
    private String description;
    private String seller;
    private String photo;

    public Food(String name, String price, String description, String seller, String photo) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.seller = seller;
        this.photo = photo;
    }

    public Food(String photo) {
        this.photo = photo;
    }

    public Food(String name, String price, String description, String seller) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
