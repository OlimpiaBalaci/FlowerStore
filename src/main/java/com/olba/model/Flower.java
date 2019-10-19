package com.olba.model;

@Entity
@Table

public class Flower {

    private int id;
    private String flowerName;
    private String price;
    private double quantity;

    public Flower(int id, String flowerName, String price, double quantity) {
        this.id = id;
        this.flowerName = flowerName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
