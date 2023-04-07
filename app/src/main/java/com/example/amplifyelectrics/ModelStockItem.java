package com.example.amplifyelectrics;

public class ModelStockItem {

    String title;
    String manufacturer;
    String category;
    int image;
    double price;

    public ModelStockItem(String title, String manufacturer, String category, int image, double price) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.category = category;
        this.image = image;
        this.price = price;
    }

    public ModelStockItem(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
