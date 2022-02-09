package taller_1;

import javax.swing.*;

public class Pet {

    public String name;
    public String type;
    private Integer weight;
    protected String gender;

    public Pet(String name, String type, int weight, String gender) {

        this.name = name;
        this.type = type;
        this.weight = weight;
        this.gender = gender;
    }

    public void ShowDataPet(){
        System.out.println(this.name+" ,"+this.type+" ,"+this.weight+" ,"+this.gender);
    }
}
