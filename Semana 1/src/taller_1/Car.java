package taller_1;

import javax.swing.*;

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

    private void RequestData(){
        brand = JOptionPane.showInputDialog("Type the brand");
        model = JOptionPane.showInputDialog("Type the model");
        color = JOptionPane.showInputDialog("Type the color");
        owner = JOptionPane.showInputDialog("Type the ownwe");
        seats = Integer.parseInt(JOptionPane.showInputDialog("Type the seats")) ;
    }

    public void ShowData(){
        System.out.println("Brand :"+brand);
        System.out.println("model :"+model);
        System.out.println("color :"+color);
        System.out.println("owner :"+owner);
        System.out.println("seats :"+seats);
    }
}
