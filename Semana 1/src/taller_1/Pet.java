package taller_1;

public class Pet {

    public String name;
    public String type;
    private float weight;
    protected String gender;

    public Pet(String name, String type, float weight, String gender) {

        this.name = name;
        this.type = type;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
