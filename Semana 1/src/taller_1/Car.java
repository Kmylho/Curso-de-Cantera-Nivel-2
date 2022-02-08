package taller_1;

import java.util.ArrayList;

public class Car {
    public String brand;
    public String model;
    public String color;
    private String owner;
    private Integer seats;

    public Car(String brand, String model, String color, String owner, Integer seats) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.owner = owner;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
